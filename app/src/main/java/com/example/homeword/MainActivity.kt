package com.example.homeword

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val horoscopeButton = findViewById<Button>(R.id.horoscopeButton)
        val horoscopeText = findViewById<TextView>(R.id.horoscopeText)

        horoscopeButton.setOnClickListener {
            val name = nameInput.text.toString()
            val horoscope = generateHoroscope(name)
            horoscopeText.text = "Hello $name, your horoscope is: $horoscope"
        }
    }

    private fun generateHoroscope(name: String): String {
        val horoscopes = listOf(
            "Today is a great day for new beginnings.",
            "Be wary of the decisions you make today.",
            "Your future is looking bright.",
            "Keep an open mind today, as something unexpected may happen.",
            "Today is a good day to focus on yourself."
        )
        val index = abs(name.length % horoscopes.size)
        return horoscopes[index]
    }
}
