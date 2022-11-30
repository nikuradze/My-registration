package com.example.myregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    private lateinit var name: EditText
    private lateinit var lastname: EditText
    private lateinit var number: EditText
    private lateinit var privatenumber:EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        lastname = findViewById(R.id.lastname)
        number = findViewById(R.id.number)
        privatenumber = findViewById(R.id.privatenumber)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            if (name.text.toString().length <3 || lastname.text.toString().length <5) {
                Toast.makeText(this, "გთხოვთ, სწორად შეიყვანოთ თქვენი სახელი და გვარი!", Toast.LENGTH_SHORT).show()
            }
            else if (number.text.toString().length != 9 || number.text.toString()[0].toString() != "5" || !number.text.toString().isDigitsOnly()){
                Toast.makeText(this, "გთხოვთ, სწორად შეიყვანოთ თქვენი ნომერი!", Toast.LENGTH_SHORT).show()
            }
            else if (privatenumber.text.toString().length !=11 || !privatenumber.text.toString().isDigitsOnly()){
                Toast.makeText(this, "გთხოვთ, სწორად შეიყვანოთ თქვენი პირადი ნომერი!", Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this, "თქვენ წარმატებით გაიარეთ რეგისტრაცია!", Toast.LENGTH_SHORT).show()
        }
    }

}