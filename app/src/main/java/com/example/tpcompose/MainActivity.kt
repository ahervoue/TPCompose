package com.example.tpcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnValider = findViewById<Button>(R.id.btnValider)
        btnValider.setOnClickListener {
            Toast.makeText(this, "Nous avons cliqué sur le bouton", Toast.LENGTH_LONG).show()
        }
    }
}