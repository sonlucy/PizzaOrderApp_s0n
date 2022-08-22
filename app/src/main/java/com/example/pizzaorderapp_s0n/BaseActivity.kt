package com.example.pizzaorderapp_s0n

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents() // 이벤트 처리 함수들을 모아두는 함수
    abstract fun setValues()  //데이터를 띄우기위한 함수를 모아두는 함수

}