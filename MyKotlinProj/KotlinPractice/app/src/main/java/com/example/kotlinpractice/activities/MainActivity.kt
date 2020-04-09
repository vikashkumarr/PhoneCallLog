package com.example.kotlinpractice.activities

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinpractice.R
import com.example.kotlinpractice.constants.Constants
import com.example.kotlinpractice.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG : String = MainActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // simple Toast
        showTextToast.setOnClickListener {
            Log.i(TAG,"Button Clicked !!")
            showToast("Welcome to Kotlin !!")
          //  Toast.makeText(it.context, "Welcome to Kotlin!!", Toast.LENGTH_LONG).show()
            //Toast.makeText(this, "Welcome to Kotlin!!", Toast.LENGTH_LONG).show()
        }

        // Sharing data using Explicit Intent
        sendDataToSecondActivity.setOnClickListener {
            val message = userInput.text.toString().trim()
            var secondActivity = Intent(this, SecondActivity::class.java)
            secondActivity.putExtra(Constants.USER_MSG_KEY, message)
            startActivity(secondActivity)
        }

        // Sharing data using Implicit Intent
        shareData.setOnClickListener {
            val message = userInput.text.toString().trim()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share To:"))
        }

        // RecyclerView Click
        getData.setOnClickListener {
            val fruitActivity = Intent(this, FruitListActivity::class.java)
            startActivity(fruitActivity)
        }

    }
}
