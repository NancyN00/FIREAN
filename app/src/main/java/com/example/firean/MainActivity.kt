package com.example.firean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingTextView =  findViewById<TextView>(R.id.etName)
        val inputField = findViewById<EditText>(R.id.firename)
        val submitButton = findViewById<Button>(R.id.fireb)
        val offersButton = findViewById<Button>(R.id.btnof)

        submitButton.setOnClickListener {
            val enteredName = inputField.text.toString()
            if (enteredName == "") {
                offersButton.visibility = INVISIBLE
                greetingTextView.text = ""
                   Toast.makeText(this@MainActivity, "Please Enter Your Name",
                       Toast.LENGTH_SHORT).show()
            } else {
                val message = "Welcome $enteredName "
                greetingTextView.text = message
                inputField.text.clear()
                offersButton.visibility = VISIBLE
            }
        }

    }
}