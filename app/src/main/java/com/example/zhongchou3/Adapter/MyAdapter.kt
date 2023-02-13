package com.example.zhongchou3.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.zhongchou3.Fund
import com.example.zhongchou3.R

class MyAdapter(val myFundList: List<Fund>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val fundImage: ImageView = view.findViewById(R.id.fund_Image)
        val fundName: TextView = view.findViewById(R.id.fund_name)
        val fundCard: TextView = view.findViewById(R.id.fund_card)
        val fundReason: TextView = view.findViewById(R.id.fund_reason)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fund_item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fund = myFundList[position]
        holder.adapterPosition
        holder.fundImage.setImageResource(fund.Imag)
        holder.fundName.text = fund.name
        holder.fundCard.text=fund.card
        holder.fundReason.text=fund.reason
    }
    override fun getItemCount() = myFundList.size
}