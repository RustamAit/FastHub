package kz.example.android.fasthub.core.utills

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.empty_state_view.view.*
import kz.example.android.fasthub.R

class EmptyStateView(context: Context, attrs: AttributeSet): RelativeLayout(context,attrs){

    private var hintTextView: TextView? = null
    private var reloadBtn: Button? = null

    init {

        View.inflate(context, R.layout.empty_state_view,this)
        this.hintTextView = hintText
        this.reloadBtn = reloadButton

    }

    fun setHintText(text: String){
        hintTextView?.text = text
    }

    fun setReloadBtnOnClick(onClick: () -> Unit){
        reloadBtn?.setOnClickListener {
            onClick()
        }
    }

}