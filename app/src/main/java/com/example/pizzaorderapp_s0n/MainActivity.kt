package com.example.pizzaorderapp_s0n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        //버튼 클릭 등의 이벤트 관련 코드 모음.

    }

    override fun setValues() {
        // 화면에 데이터를 표시하기 위한 코드 모음.

        //뷰페이저 작업


        //탭레이아웃과 연결
        mainTabLayout.setupWithViewPager()
    }


}