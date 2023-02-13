package com.example.zhongchou3.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.zhongchou3.Fund
import com.example.zhongchou3.FundDetail
import com.example.zhongchou3.R

class FundAdapter(val fundList: List<Fund>) :
    RecyclerView.Adapter<FundAdapter.ViewHolder>() {

    lateinit var onItemClick: (Int) -> Unit

    fun setOnItemClickListener(onItemClick: (Int) -> Unit) {
        this.onItemClick= onItemClick
    }

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
        val fund = fundList[position]
        holder.adapterPosition
        holder.fundImage.setImageResource(fund.Imag)
        holder.fundName.text = fund.name
        holder.fundCard.text=fund.card
        holder.fundReason.text=fund.reason

        holder.itemView.setOnClickListener {
            val position=holder.adapterPosition
            onItemClick.invoke(position)

        }


    }
    override fun getItemCount() = fundList.size
    }
