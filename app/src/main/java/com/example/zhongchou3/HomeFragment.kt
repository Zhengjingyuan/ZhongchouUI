package com.example.zhongchou3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zhongchou3.Adapter.FundAdapter
import com.example.zhongchou3.Adapter.MyAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fund_item.*
import kotlinx.android.synthetic.main.top_mybar.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private val fundList = ArrayList<Fund>()
    private val MyfundList=ArrayList<Fund>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initFunds()
        val layoutManager = LinearLayoutManager(view.context)
        recyclerView.layoutManager = layoutManager
        val adapter = FundAdapter(fundList)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener() {
            val intent= Intent(activity,FundDetail::class.java)
            intent.putExtra("fund", fundList.get(it))//强转
            startActivity(intent)
        }
        //我的项目
        initMyfunds()
        val mylayoutManager = LinearLayoutManager(view.context)
        mylayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        myrecycleview.layoutManager = mylayoutManager
        val myadapter = MyAdapter(MyfundList)
        myrecycleview.adapter = myadapter
        myadapter.notifyDataSetChanged()

    }
    private fun initFunds(){
        fundList.add(Fund("李华1","1666654","50000","白血病",R.mipmap.img,true))
        fundList.add(Fund("李华2","2666654","50000","白血病",R.mipmap.img,true))
        fundList.add(Fund("李华3","3666654","50000","白血病",R.mipmap.img,true))
        fundList.add(Fund("李华4","4666654","50000","白血病",R.mipmap.img,true))
        fundList.add(Fund("李华5","5666654","50000","白血病",R.mipmap.img,true))
        fundList.add(Fund("李华6","6666654","50000","白血病",R.mipmap.img,true))
        fundList.add(Fund("李华7","7666654","50000","白血病",R.mipmap.img,true))
        fundList.add(Fund("李华8","8666654","50000","白血病",R.mipmap.img,true))
        fundList.add(Fund("李华9","9666654","50000","白血病",R.mipmap.img,true))
        fundList.add(Fund("李华10","10666654","50000","白血病",R.mipmap.img,true))
        fundList.add(Fund("李华11","11666654","50000","白血病",R.mipmap.img,true))
    }
    private fun initMyfunds(){
        MyfundList.add(Fund("李华1","1666654","50000","白血病",R.mipmap.img,true))
        MyfundList.add(Fund("李华2","2666654","50000","白血病",R.mipmap.img,true))
    }



}