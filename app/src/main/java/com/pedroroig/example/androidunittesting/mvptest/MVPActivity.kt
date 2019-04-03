package com.pedroroig.example.androidunittesting.mvptest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pedroroig.example.androidunittesting.R

class MVPActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)
    }
}
