package com.pedroroig.example.androidunittesting

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pedroroig.example.androidunittesting.errorcodestest.ErrorCodesActivity
import com.pedroroig.example.androidunittesting.mvptest.MVPActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonErrorCodes.setOnClickListener {
            startActivity(Intent(this, ErrorCodesActivity::class.java))
        }

        buttonMVP.setOnClickListener {
            startActivity(Intent(this, MVPActivity::class.java))
        }
    }
}
