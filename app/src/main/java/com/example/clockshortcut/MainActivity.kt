package com.example.clockshortcut

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val packageName = "com.google.android.deskclock"

        val intent = Intent(Intent.ACTION_MAIN)
        intent.setPackage(packageName)

        startActivity(intent)
        finish()
    }
}
