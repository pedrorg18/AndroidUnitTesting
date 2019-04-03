package com.pedroroig.example.androidunittesting.mvptest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pedroroig.example.androidunittesting.R
import kotlinx.android.synthetic.main.activity_mvp.*

class MVPActivity : AppCompatActivity(), MVPView {

    private val presenter = MVPPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)

        presenter.layoutDefaultGreetingMessage()

    }

    override fun setMessageText(message: String) {
        tvMessage.text = message
    }
}
