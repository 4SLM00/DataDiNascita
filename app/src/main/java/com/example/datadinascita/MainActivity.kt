package com.example.datadinascita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText=findViewById(R.id.editTextNumber)
        textView=findViewById(R.id.textView)
        button=findViewById(R.id.button)

        button.setOnClickListener(){
            val annoAttuale=2021
            if(editText.text != null && !editText.text.isEmpty()){
                var annodinascita = editText.text.toString().toInt()
                var eta = annoAttuale - annodinascita
                textView.text = "hai $eta anni"
            }else {
                textView.text = "inserisci il tuo anno di nascita perfavore"
            }
        }
    }

}
