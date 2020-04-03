package kz.example.android.fasthub.ui.pullRequests

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_pull_requests_list.*

import kz.example.android.fasthub.R
import kz.example.android.fasthub.data.IssueType
import kz.example.android.fasthub.data.domain.Issue
import kz.example.android.fasthub.ui.adapters.IssuesAdapter
import kz.example.android.fasthub.ui.issues.IssueViewModel
import org.koin.android.viewmodel.ext.android.sharedViewModel

private const val ISSUE_TYPE = "issueType"

class PullRequestsListFragment : Fragment(R.layout.fragment_pull_requests_list) {

    private var issueType: String? = null

    private val pullRequestsViewModel: PullRequestsViewModel by sharedViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            issueType = it.getString(ISSUE_TYPE)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        swipeRefresh?.isRefreshing = true
        pullRequestRecList?.layoutManager = LinearLayoutManager(context)
        pullRequestsViewModel.fetchData()
        issueType?.let {issueType ->
            when(issueType){
                IssueType.created -> {
                    pullRequestsViewModel.createdPullRequestsLiveData.observe(this, issueListObserver)
                }
                IssueType.mentioned -> {
                    pullRequestsViewModel.mentionedPullRequestsLiveData.observe(this, issueListObserver)
                }
                IssueType.assigned -> {
                    pullRequestsViewModel.assignedPullRequestsLiveData.observe(this, issueListObserver)
                }
                else -> {
                    pullRequestsViewModel.createdPullRequestsLiveData.observe(this, issueListObserver)
                }
            }
        }

        swipeRefresh?.setOnRefreshListener {
            pullRequestsViewModel.fetchData()
        }

    }

    private val issueListObserver: Observer<List<Issue>> = Observer<List<Issue>> {
        swipeRefresh.isRefreshing = false
        if(it.isEmpty()){
            showEmptyState()
        }else{
            showList(it)
        }
    }

    private fun showEmptyState(){
        pullRequestRecList?.visibility = RecyclerView.GONE
        emptyStateView?.setHintText("No issues")
        emptyStateView?.setReloadBtnOnClick {
            pullRequestsViewModel.fetchData()
        }
        emptyStateView?.visibility = RelativeLayout.VISIBLE
    }

    private fun showList(list: List<Issue>){
        pullRequestRecList?.adapter = IssuesAdapter(list)
        pullRequestRecList?.visibility = RecyclerView.VISIBLE
        emptyStateView?.visibility = RelativeLayout.GONE

    }

    companion object {
        @JvmStatic
        fun newInstance(issueType: String) =
            PullRequestsListFragment().apply {
                arguments = Bundle().apply {
                    putString(ISSUE_TYPE, issueType)
                }
            }
    }
}