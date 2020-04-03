package kz.example.android.fasthub.ui.issues


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_issue_list.*

import kz.example.android.fasthub.R
import kz.example.android.fasthub.data.IssueType
import kz.example.android.fasthub.data.domain.Issue
import kz.example.android.fasthub.ui.adapters.IssuesAdapter
import org.koin.android.viewmodel.ext.android.sharedViewModel

private const val ISSUE_TYPE = "issueType"

class IssueListFragment : Fragment(R.layout.fragment_issue_list) {

    private var issueType: String? = null

    private val issueViewModel: IssueViewModel by sharedViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            issueType = it.getString(ISSUE_TYPE)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        swipeRefresh?.isRefreshing = true
        issueRecList?.layoutManager = LinearLayoutManager(context)
        issueViewModel.fetchData()
        issueType?.let {issueType ->
            when(issueType){
                IssueType.created -> {
                    issueViewModel.createdIssuesLiveData.observe(this, issueListObserver)
                }
                IssueType.mentioned -> {
                    issueViewModel.mentionedIssuesLiveData.observe(this, issueListObserver)
                }
                IssueType.assigned -> {
                    issueViewModel.assignedIssuesLiveData.observe(this, issueListObserver)
                }
                else -> {
                    issueViewModel.createdIssuesLiveData.observe(viewLifecycleOwner, issueListObserver)
                }
            }
        }

        swipeRefresh?.setOnRefreshListener {
            issueViewModel.fetchData()
        }

    }

    private val issueListObserver: Observer<List<Issue>> = Observer<List<Issue>> {
        swipeRefresh?.isRefreshing = false
        if(it.isEmpty()){
            showEmptyState()
        }else{
            showList(it)
        }
    }

    private fun showEmptyState(){
        issueRecList?.visibility = RecyclerView.GONE
        emptyStateView?.setHintText("No issues")
        emptyStateView?.setReloadBtnOnClick {
            issueViewModel.fetchData()
        }
        emptyStateView?.visibility = RelativeLayout.VISIBLE
    }

    private fun showList(list: List<Issue>){
        issueRecList?.adapter = IssuesAdapter(list)
        issueRecList?.visibility = RecyclerView.VISIBLE
        emptyStateView?.visibility = RelativeLayout.GONE

    }

    companion object {
        @JvmStatic
        fun newInstance(issueType: String) =
            IssueListFragment().apply {
                arguments = Bundle().apply {
                    putString(ISSUE_TYPE, issueType)
                }
            }
    }
}
