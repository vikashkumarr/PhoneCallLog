package com.example.kotlinpractice.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinpractice.R
import com.example.kotlinpractice.models.Fruit
import com.example.kotlinpractice.showToast
import kotlinx.android.synthetic.main.list_item.view.*

class FruitAdapter(private val context: Context, private val fruitList: List<Fruit>) :
    RecyclerView.Adapter<FruitAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = fruitList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val itemList = fruitList[position]          // fruitList.get(position)
        holder.setDataToText(itemList, position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var fruit: Fruit? = null

        init {

            itemView.setOnClickListener {
                //  If "fruit is null then block won't execute
                fruit?.let {
                    context.showToast(
                        "U clicked on : ${fruit?.title}",
                        Toast.LENGTH_SHORT
                    )
                }
            }

            // Specific image click
            itemView.imgShare.setOnClickListener {
                // If "message is null then block won't execute
                val message = "Hi This is Vikash Kumar"
                message?.let {
                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plain"
                    context.startActivity(Intent.createChooser(intent, "Share To:"))
                }

            }
        }

        fun setDataToText(itemList: Fruit?, position: Int) {
            itemView.txvTitle.text = itemList!!.title
            this.fruit = itemList
        }

    }
}