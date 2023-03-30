package com.kabekus.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kabekus.basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //viewBinding
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    var number1 :Int? = null
    var number2 :Int? = null
    var result : Int? = null
    fun addition(view: View){
        number1 = binding.numberOneTxt.text.toString().toIntOrNull()
        number2 = binding.numberTwoTxt.text.toString().toIntOrNull()
        result = number1!!+number2!!
        binding.resultTxt.text = "Sonuç : $result"
    }
    fun subtraction(view: View){
        number1 = binding.numberOneTxt.text.toString().toIntOrNull()
        number2 = binding.numberTwoTxt.text.toString().toIntOrNull()
        if (number1!! > number2!!){
            result = number1!! - number2!!
        }else if (number2!! > number1!!){
            result = number2!! - number1!!
        }
        binding.resultTxt.text = "Sonuç : $result"
    }
    fun multiplication(view: View){
        number1 = binding.numberOneTxt.text.toString().toIntOrNull()
        number2 = binding.numberTwoTxt.text.toString().toIntOrNull()
        result = number1!!*number2!!
        binding.resultTxt.text = "Sonuç : $result"
    }
    fun division(view: View){
        number1 = binding.numberOneTxt.text.toString().toIntOrNull()
        number2 = binding.numberTwoTxt.text.toString().toIntOrNull()
        result = number1!! / number2!!
        binding.resultTxt.text = "Sonuç : $result"
    }

}