package com.xiaocao.me.base

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val TAG: String = this.javaClass.simpleName

    lateinit var mActivity: AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = this
    }


    fun startActivity(cls: Class<*>) {
        val intent = Intent(mActivity.applicationContext, cls)
        mActivity.startActivity(intent)
    }
}