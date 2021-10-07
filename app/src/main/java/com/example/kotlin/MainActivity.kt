package com.example.kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button: Button
    lateinit var textView: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = SecretData("314159265", "Some Body")
        button = findViewById(R.id.test_button)
        button.setOnClickListener(this)

        val textInput = findViewById<TextView>(R.id.text_view_title)
        textInput.text = data.toString()

        val textInputCopy = findViewById<TextView>(R.id.text_view_note)
        textInputCopy.text = copyFun().toString()

    }

    companion object {
        fun copyFun(): SecretData {
            val dataToCopy = SecretData("314159265", "Some Body")
            return dataToCopy.copy(passNumber = "3141724", name = "Some One")
        }

    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.test_button -> {
                Toast.makeText(this, "Why are u doing this?!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun doPrint() {
        val someData: List<String> = arrayListOf()

        for (data in someData) {
            println(data)
        }
    }
}



