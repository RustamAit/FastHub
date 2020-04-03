package kz.example.android.fasthub.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import kotlinx.android.synthetic.main.item_feed_event.view.*
import kz.example.android.fasthub.R
import kz.example.android.fasthub.data.domain.FeedEvent

class FeedEventAdapter(private val dataset: List<FeedEvent>): RecyclerView.Adapter<FeedEventViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedEventViewHolder {
        return FeedEventViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_feed_event,parent,false))
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: FeedEventViewHolder, position: Int) {
        holder.bind(dataset[position])
    }
}

class FeedEventViewHolder(v: View): RecyclerView.ViewHolder(v){
    fun bind(p: FeedEvent){
        itemView.eventTitle.text = p.getEventTitle()
        itemView.eventCreatedAt.text = p.created_at

        Glide.with(itemView)
            .load(p.actor.avatarUrl)
            .transform(RoundedCorners(20))
            .placeholder(R.color.colorAccent)
            .into(itemView.avatarView)
    }
}