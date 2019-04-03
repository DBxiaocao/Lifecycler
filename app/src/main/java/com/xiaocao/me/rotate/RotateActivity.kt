package com.xiaocao.me.rotate

import android.os.Bundle
import android.util.Log
import com.xiaocao.me.R
import com.xiaocao.me.base.BaseActivity
import kotlinx.android.synthetic.main.activity_rotate.*

/**
 * activity 横竖屏切换生命周期
 *
 * 打开一个activity至横竖屏切换什么周期  onCreate->onStart->onResume->onPause->onStop->onDestroy->onCreate->onStart->onResume
 * A打开B  AB生命周期  A-> onPause  B->onCreate->onStart->onResume A ->onStop
 * 当前Activity 息屏    onPause->onStop    亮屏  onRestart->onStart->onResume
 * homge 键  onPause->onStop  回到当前页面  onRestart->onStart->onResume
 */
class RotateActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.w(TAG,"onCreate+++++++++++++++++++++++++++++++++++++++")
        setContentView(R.layout.activity_rotate)
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
