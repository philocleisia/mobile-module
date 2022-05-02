package com.example.mobile_module

import android.widget.*
import kotlinx.android.synthetic.main.activity_variables_block.*

class Vars {
    private val numbersMap = mutableMapOf<String, String>()

    fun insertData(key: String, value:String ){
        numbersMap.put(key,value)
        println(numbersMap)
    }

    fun addVariable(){
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