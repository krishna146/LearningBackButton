package com.krishna.learningbackbutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNewActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNewActivity = findViewById(R.id.btnNewActivity)
        btnNewActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, NewActivity::class.java)
            startActivity(intent)
        }

    }
}
