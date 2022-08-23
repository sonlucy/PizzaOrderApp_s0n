package com.example.pizzaorderapp_s0n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.pizzaorderapp_s0n.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStoreData : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        //여기서 집어넣기
        mStoreData = intent.getSerializableExtra("storeData") as Store

        Glide.with(mContext).load(mStoreData.logoURL).into(storeLogoImg)  //베이스액티비티 mContext. / logo주소를 storeLogoImg에 뿌릴거임

        //가게이름, 전화번호
        storePhoneNumTxt.text = mStoreData.phoneNum
        storeNameTxt.text=mStoreData.name
    }


}