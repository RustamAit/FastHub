package kz.example.android.fasthub.ui.pullRequests


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_pull_request_host.*

import kz.example.android.fasthub.R
import kz.example.android.fasthub.data.IssueType
import org.koin.android.viewmodel.ext.android.viewModel


class PullRequestHostFragment : Fragment(R.layout.fragment_pull_request_host) {

    private val pullRequestsViewModel: PullRequestsViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pullRequestsViewModel.fetchData()
        pager.adapter = PullRequestFragmentAdapter(this)
        TabLayoutMediator(tab_layout,pager){tab, position ->
            when(position){
                0 -> {
                    tab.text = IssueType.created
                }
                1 -> {
                    tab.text = IssueType.assigned
                }
                2 -> {
                    tab.text = IssueType.mentioned
                }

                else -> {
                    tab.text = IssueType.created
                }
            }
        }.attach()
    }

}

class PullRequestFragmentAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                PullRequestsListFragment.newInstance(IssueType.created)
            }
            1 -> {
                PullRequestsListFragment.newInstance(IssueType.assigned)
            }
            2 -> {
                PullRequestsListFragment.newInstance(IssueType.mentioned)
            }
            else -> {
                PullRequestsListFragment.newInstance(IssueType.created)
            }
        }
    }
}
