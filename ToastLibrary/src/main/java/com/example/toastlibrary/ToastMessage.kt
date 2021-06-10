package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

object ToastMessage {
    fun printToastMessage(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}