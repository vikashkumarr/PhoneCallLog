package com.example.kotlinpractice

import android.content.Context
import android.widget.Toast

// Here we're using "Extension function" and "Default parameter concept
fun Context.showToast(message: String,toastDuration : Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, toastDuration).show()
}