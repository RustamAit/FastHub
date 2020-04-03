package kz.example.android.fasthub.ui.issues


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_issue_host.*

import kz.example.android.fasthub.R
import kz.example.android.fasthub.data.IssueType
import org.koin.android.viewmodel.ext.android.viewModel

class IssueHostFragment : Fragment(R.layout.fragment_issue_host) {

    val issueViewModel: IssueViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        issueViewModel.fetchData()
        pager?.adapter = IssuesFragmentsAdapter(this)
        tab_layout?.let {tabLayout ->
            pager?.let { pager->
                TabLayoutMediator(tabLayout,pager){tab, position ->
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
                            IssueListFragment.newInstance(IssueType.created)
                        }
                    }
                }.attach()
            }
        }

    }

}

class IssuesFragmentsAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                IssueListFragment.newInstance(IssueType.created)
            }
            1 -> {
                IssueListFragment.newInstance(IssueType.assigned)
            }
            2 -> {
                IssueListFragment.newInstance(IssueType.mentioned)
            }
            else -> {
                IssueListFragment.newInstance(IssueType.created)
            }
        }
    }
}
