package com.nepplus.viewpager_20210327.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager_20210327.fragments.PageFragment1
import com.nepplus.viewpager_20210327.fragments.PageFragment2
import com.nepplus.viewpager_20210327.fragments.PageFragment3

class MainViewPageAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){

//position에 따른 페이지의 제목 리턴
//리턴을 하는데 -> position값에 따라 다른 결과가 리턴되도록 하는 코틀린 문법 예시
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "인사"
            1 -> "자기소개"
            else -> "하고싶은말"
        }
    }

    override fun getItem(position: Int): Fragment {
//position의 값에 따라 다른 Fragment 리턴

        return when(position){
            0 -> PageFragment1()
            1 -> PageFragment2()
            else -> PageFragment3()

        }
    }

    override fun getCount(): Int {
        return 3
    }
}