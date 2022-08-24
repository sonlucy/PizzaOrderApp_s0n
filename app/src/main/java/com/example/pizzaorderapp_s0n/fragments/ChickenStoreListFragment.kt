package com.example.pizzaorderapp_s0n.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pizzaorderapp_s0n.R
import com.example.pizzaorderapp_s0n.ViewStoreDetailActivity
import com.example.pizzaorderapp_s0n.adapters.PizzaStoreAdapter
import com.example.pizzaorderapp_s0n.datas.Store
import kotlinx.android.synthetic.main.fragment_chicken_store_list.*
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class ChickenStoreListFragment :Fragment() {

    val mChickenStoreDataList = ArrayList<Store>()
    lateinit var mChickenStoreAdapter: PizzaStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chicken_store_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //동작 관련 코드

        mChickenStoreDataList.add(Store("땅땅치킨", "1111-2222", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20160615_204%2Fdd2954_14659524423601M2hj_PNG%2F%25C7%25C1%25B7%25CE%25C7%25CA_%25B6%25A5%25B6%25A5%25C4%25A1%25C5%25B2_%25B7%25CE%25B0%25ED.PNG&type=a340"))
        mChickenStoreDataList.add(Store("BBQ", "1111-3333", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20160507_233%2Fppanppane_1462548783999tnIYw_PNG%2FUntitled-1-36.png&type=sc960_832"))
        mChickenStoreDataList.add(Store("처갓집양념치킨", "1111-4444", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20140311_160%2Fluvkkkk_1394496921689NEUuf_PNG%2F%25BD%25BA%25C5%25A9%25B8%25B0%25BC%25A6_2014-02-21_%25BF%25C0%25C8%25C4_5.09.16.png&type=a340"))
        mChickenStoreDataList.add(Store("교촌치킨", "1111-5555", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20130413_124%2Fparanzui_1365843153818dx3me_JPEG%2FCF%25BD%25B4%25C6%25DB%25C1%25D6%25B4%25CF%25BE%25EE%25B0%25AD%25C0%25CE.%25B5%25BF%25C7%25D8.%25BF%25A1%25C0%25CF%25B8%25AE15.jpg&type=a340"))

        mChickenStoreAdapter = PizzaStoreAdapter(requireContext(), R.layout.pizza_store_list_item, mChickenStoreDataList)

        chickenStoreListView.adapter = mChickenStoreAdapter

//        프래그먼트에서 가게 누르면 해당 가게로 넘어가도록 코딩.
        chickenStoreListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStore = mChickenStoreDataList[position]

            val myIntent = Intent(requireContext(), ViewStoreDetailActivity::class.java)  //Intent(출발,도착)
            myIntent.putExtra("storeData", clickedStore)  //clickedStore -> Store니까 Store클래스에 Serialize하기
            startActivity(myIntent)
        }

    }
}