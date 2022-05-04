package ru.stepashkin.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String = "Ivan"
        val surname: String = "Ivanov"
        val age: Int = 37
        val heigth: Double = 172.2

        val summary: String = "name: $name surname: $surname age: $age height: $heigth"

        val output: TextView = findViewById(R.id.output)
        output.text = summary

        Log.e(TAG, summary)

    }
}