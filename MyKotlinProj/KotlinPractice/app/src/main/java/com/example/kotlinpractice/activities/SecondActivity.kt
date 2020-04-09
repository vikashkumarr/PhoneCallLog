package com.example.kotlinpractice.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinpractice.R
import com.example.kotlinpractice.constants.Constants
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val myBundle: Bundle? = intent.extras                                // It's like getIntent().getExtra() in Java

        //Safe Call ?.
        //Safe Call with let ?.let{ }

        // If "myBundle is null then block won't execute
        myBundle?.let {
            val myData = myBundle!!.getString(Constants.USER_MSG_KEY)
            showText.text = myData                                      // setting data to the text view
        }

    }
}
