package com.example.pizzaorderapp_s0n

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.pizzaorderapp_s0n.datas.Store
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
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
        //전화걸기 버튼 눌럿을때 이벤트
        callPhoneBtn.setOnClickListener {
            
            //전화 권한 허가 팝업창 띄우는
            val permissionListener = object : PermissionListener {
                override fun onPermissionGranted() {
                    val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                    Toast.makeText(mContext, "전화 연결 권한이 없습니다.", Toast.LENGTH_SHORT).show()
                }

            }
            
            //실제로 권한 확인 요청
            TedPermission.create()
                .setPermissionListener(permissionListener)  //권한가이드북 어떤거 볼거니
                .setDeniedMessage("[설정]에서 전화 권한을 허용해주세요.")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()  //CALL_PHONE 권한에 대해 체크해주세요


        }

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