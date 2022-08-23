package com.example.pizzaorderapp_s0n.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pizzaorderapp_s0n.R
import com.example.pizzaorderapp_s0n.adapters.PizzaStoreAdapter
import com.example.pizzaorderapp_s0n.datas.Store
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class PizzaStoreListFragment :Fragment() {

    val mPizzaStoreDataList = ArrayList<Store>()

    lateinit var mPizzaStoreAdapter :PizzaStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list, container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //동작 관련 코드

        mPizzaStoreDataList.add(Store("도미노피자","1577-3082","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20160530_173%2Fppanppane_14646176567743d7hd_PNG%2F%25B5%25B5%25B9%25CC%25B3%25EB%25C7%25C7%25C0%25DA_%25B7%25CE%25B0%25ED_%25282%2529.png&type=sc960_832"))
        mPizzaStoreDataList.add(Store("피자헛"," 1588-5588","https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2F20130425_227%2Fcafe20day_1366837639101bA1tS_JPEG%2F%25C7%25C7%25C0%25DA%25C7%25EA_%25B7%25CE%25B0%25ED_Converted.jpg&type=sc960_832"))
        mPizzaStoreDataList.add(Store("피자스쿨","1544-9524","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAyMTZfMzEg%2FMDAxNjEzNDg1OTIyNzM4.1EVUA7ohmbya5tbypShtdDcAQ0xBny2ItQDKsUkYPWMg.qH4YC5xU3B64S6ULv6nPnbuypBeA_K6bfj7z6ZL9PV0g.JPEG.startup777d%2FKakaoTalk_20210216_231033545_04.jpg&type=a340"))
        mPizzaStoreDataList.add(Store("반올림피자샵","1688-4827","https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2FMjAxNjEwMjBfMjE3%2FMDAxNDc2OTMwMjE1MDcz.Ta9iqCJ-Wf46x8tHKdx3DJExtflh0M6vtSi17dR-I6Ag.RC-27VF-eiFKBqtc7-FV5ZqpjmtDrolQkDmiMRv8htsg.JPEG.sy2104000%2F%25C7%25C7%25C0%25DA%25BC%25A5%25B7%25CE%25B0%25ED.jpg&type=sc960_832"))

        mPizzaStoreAdapter = PizzaStoreAdapter(requireContext(), R.layout.pizza_store_list_item, mPizzaStoreDataList)

        pizzaStoreListView.adapter = mPizzaStoreAdapter
    }

}