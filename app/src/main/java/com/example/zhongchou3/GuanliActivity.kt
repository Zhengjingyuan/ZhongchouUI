package com.example.zhongchou3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zhongchou3.Adapter.FundAdapter
import kotlinx.android.synthetic.main.activity_guanli.*
import kotlinx.android.synthetic.main.top_mybar.*

class GuanliActivity : AppCompatActivity() {
    val NoCheckList=ArrayList<Fund>()
    val HaveCheckList=ArrayList<Fund>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guanli)
        val mylayoutManager = LinearLayoutManager(this)
        mylayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        myrecycleview.layoutManager = mylayoutManager

        initNoCheckFund()
        val myadapter = FundAdapter(NoCheckList)
        myrecycleview.adapter = myadapter
        myadapter.setOnItemClickListener {
            val intent= Intent(this,FundDetail::class.java)
            intent.putExtra("fund", NoCheckList.get(it))//强转
            startActivity(intent) }

        initHaveCheckFund()
        val hcadapter = FundAdapter(NoCheckList)
        hcrecycleview.adapter = myadapter
        hcadapter.setOnItemClickListener {
            val intent= Intent(this,FundDetail::class.java)
            intent.putExtra("fund", HaveCheckList.get(it))//强转
            startActivity(intent) }
    }

    private fun initHaveCheckFund() {
        TODO("Not yet implemented")
    }

    private fun initNoCheckFund() {

    }
}