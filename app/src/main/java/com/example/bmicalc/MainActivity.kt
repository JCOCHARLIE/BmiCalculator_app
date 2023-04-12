package com.example.bmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var txt_display_answer: TextView
    private lateinit var edt_weight: EditText
    private lateinit var edt_height: EditText
    private lateinit var calc_btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_display_answer = findViewById(R.id.bmians)
        edt_weight = findViewById(R.id.edtweight)
        edt_height = findViewById(R.id.edtheight)
        calc_btn = findViewById(R.id.calculatebtn)

        calc_btn.setOnClickListener {
            var first_num = edt_weight.text.toString().trim()
            var second_num = edt_height.text.toString().trim()

            //user validation
            if (first_num.isEmpty() || second_num.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show()
            } else {

                var answer = first_num.toDouble() / ((second_num.toDouble()/100) * (second_num.toDouble()/100))
                txt_display_answer.text = answer.toString()

                //Toast.makeText(this, "Trying to calculate", Toast.LENGTH_SHORT).show()
            }
        }
    }
}