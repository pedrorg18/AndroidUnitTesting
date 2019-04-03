package com.pedroroig.example.androidunittesting.errorcodestest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import com.pedroroig.example.androidunittesting.R
import kotlinx.android.synthetic.main.activity_error_codes.*


/**
 * The objective is to parse the error message from the strings inside the spinner.
 * The one which does not contain number will return 0
 */
class ErrorCodesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error_codes)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val currentValue = parent!!.getItemAtPosition(position).toString()
                if(currentValue.trim().isNotEmpty()) {
                    calculateAndPrintErrorCode(currentValue)
                }
            }

        }
    }

    private fun calculateAndPrintErrorCode(currentValue: String) {
        // Calculate error code and set it to textView
        tvResult.text = parseErrorCodeFromRawErrorBody(currentValue).toString()
    }
}
