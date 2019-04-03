package com.xiaocao.me

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xiaocao.me.base.BaseActivity
import com.xiaocao.me.rotate.RotateActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRotate.setOnClickListener {
            startActivity(RotateActivity().javaClass)
        }
    }
}
