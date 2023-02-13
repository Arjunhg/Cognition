package com.example.cognition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class components : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_components)


        val btnIntent2 = findViewById<Button>(R.id.button2)

        btnIntent2.setOnClickListener {
            //Opening a new activity

            intent  = Intent(applicationContext, insight::class.java)
            startActivity(intent)
        }


        val btnIntent3 = findViewById<Button>(R.id.button3)

        btnIntent3.setOnClickListener {
            //Opening a new activity

            intent  = Intent(applicationContext, insight2::class.java)
            startActivity(intent)
        }

        val btnIntent4 = findViewById<Button>(R.id.button4)

        btnIntent4.setOnClickListener {
            //Opening a new activity

            intent  = Intent(applicationContext, insight3::class.java)
            startActivity(intent)
        }


        val btnIntent5 = findViewById<Button>(R.id.button5)

        btnIntent5.setOnClickListener {
            //Opening a new activity

            intent  = Intent(applicationContext, insight4::class.java)
            startActivity(intent)
        }


        val btnIntent6 = findViewById<Button>(R.id.button6)

        btnIntent6.setOnClickListener {
            //Opening a new activity

            intent  = Intent(applicationContext, insight5::class.java)
            startActivity(intent)
        }
    }
}