package com.binarycase.mohamed.kotlintest

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.binarycase.mohamed.kotlintest.databinding.ActivityMainBinding
import com.binarycase.mohamed.myfirstlibrary.PrettyToast

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        PrettyToast().showSuccessToast(this,"Mohamed")
    }
}
