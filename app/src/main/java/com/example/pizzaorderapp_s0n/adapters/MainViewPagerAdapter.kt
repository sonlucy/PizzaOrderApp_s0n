package com.example.pizzaorderapp_s0n.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzaorderapp_s0n.fragments.ChickenStoreListFragment
import com.example.pizzaorderapp_s0n.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm: FragmentManager) :FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "피자 가게"
            else -> "치킨 가게"
        }
    }

    override fun getCount(): Int {
        //총 몇장짜리인가요
        return 2
    }

    override fun getItem(position: Int): Fragment {
        //포지션마다 어떤 프래그먼트가 나가야하나요
        return when(position){
            0 -> PizzaStoreListFragment()
            else -> ChickenStoreListFragment()

        }
    }
}