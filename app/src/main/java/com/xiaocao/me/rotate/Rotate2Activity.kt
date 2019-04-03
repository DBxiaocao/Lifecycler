package com.xiaocao.me.rotate

import android.os.Bundle
import android.util.Log
import com.xiaocao.me.R
import com.xiaocao.me.base.BaseActivity
import kotlinx.android.synthetic.main.activity_rotate.*

class Rotate2Activity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotate)
        Log.w(TAG,"onCreate+++++++++++++++++++++++++++++++++++++++")
        btnNextAct.setOnClickListener {
            startActivity(Rotate2Activity().javaClass)
        }
    }

    override fun onStart() {
        Log.w(TAG,"onStart+++++++++++++++++++++++++++++++++++++++")
        super.onStart()
    }

    override fun onRestart() {
        Log.w(TAG,"onRestart+++++++++++++++++++++++++++++++++++++++")
        super.onRestart()
    }

    override fun onResume() {
        Log.w(TAG,"onResume+++++++++++++++++++++++++++++++++++++++")
        super.onResume()
    }

    override fun onPause() {
        Log.w(TAG,"onPause+++++++++++++++++++++++++++++++++++++++")
        super.onPause()
    }

    override fun onStop() {
        Log.w(TAG,"onStop+++++++++++++++++++++++++++++++++++++++")
        super.onStop()
    }

    override fun onDestroy() {
        Log.w(TAG,"onDestroy+++++++++++++++++++++++++++++++++++++++")
        super.onDestroy()
    }

}
