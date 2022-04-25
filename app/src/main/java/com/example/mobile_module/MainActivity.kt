package com.example.mobile_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val vars:Vars = Vars()
    fun addVariable(view: View){
        val v = vars
        val editNameVar = findViewById<EditText>(R.id.varName)
        val varName = editNameVar.text.toString()
        val editAmountVar = findViewById<EditText>(R.id.varVal)
        val varAmount = editAmountVar.text.toString()
        v.insertData(varName, varAmount)
        editNameVar.setText("")
        editAmountVar.setText("")
    }
}