package kz.example.android.fasthub.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_issue.view.*
import kz.example.android.fasthub.R
import kz.example.android.fasthub.data.domain.FeedEvent
import kz.example.android.fasthub.data.domain.Issue

class IssuesAdapter(private val dataset: List<Issue>): RecyclerView.Adapter<IssuesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IssuesViewHolder {
        return IssuesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_issue,parent,false))
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: IssuesViewHolder, position: Int) {
        holder.bind(dataset[position])
    }
}

class IssuesViewHolder(v: View): RecyclerView.ViewHolder(v){
    fun bind(p: Issue){
        itemView.issueTitle.text = p.title
        itemView.issueCreatedAt.text = p.created_at
        itemView.issueRepo.text = p.repo.name
    }
}