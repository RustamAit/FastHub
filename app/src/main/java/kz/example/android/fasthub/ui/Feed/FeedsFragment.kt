package kz.example.android.fasthub.ui.Feed


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_feeds.*

import kz.example.android.fasthub.R
import kz.example.android.fasthub.data.domain.Actor
import kz.example.android.fasthub.data.domain.FeedEvent
import kz.example.android.fasthub.data.domain.Issue
import kz.example.android.fasthub.data.domain.Repo
import kz.example.android.fasthub.ui.adapters.FeedEventAdapter
import kz.example.android.fasthub.ui.adapters.IssuesAdapter
import org.koin.android.viewmodel.ext.android.viewModel

class FeedsFragment : Fragment(R.layout.fragment_feeds) {

    val feedViewModel: FeedViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        swipeRefresh?.isRefreshing = true
        feedRecList?.layoutManager = LinearLayoutManager(context)
        feedViewModel.fetchData()

        val feedList = ArrayList<FeedEvent>()


        feedViewModel.getFeedLiveData().observe(viewLifecycleOwner, Observer {
            swipeRefresh?.isRefreshing = false
            if(it.isEmpty()){
                showEmptyState()
            }else{
                showList(it)
            }
        })
        swipeRefresh.setOnRefreshListener {
            feedViewModel.fetchData()
        }
    }

    private fun showEmptyState(){
        feedRecList?.visibility = RecyclerView.GONE
        emptyStateView?.setHintText("No feeds")
        emptyStateView?.setReloadBtnOnClick {
            feedViewModel.fetchData()
        }
        emptyStateView?.visibility = RelativeLayout.VISIBLE
    }

    private fun showList(list: List<FeedEvent>){
        feedRecList?.adapter = FeedEventAdapter(list)
        feedRecList?.visibility = RecyclerView.VISIBLE
        emptyStateView?.visibility = RelativeLayout.GONE

    }

}
