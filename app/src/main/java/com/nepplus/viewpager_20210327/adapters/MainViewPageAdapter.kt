package com.nepplus.viewpager_20210327.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager_20210327.fragments.PageFragment1
import com.nepplus.viewpager_20210327.fragments.PageFragment2
import com.nepplus.viewpager_20210327.fragments.PageFragment3

class MainViewPageAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
//position의 값에 따라 다른 Fragment 리턴

        if(position == 0){
            return PageFragment1()
        }
        else if(position == 1){
            return PageFragment2()
        }

        else{
            return PageFragment3()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}