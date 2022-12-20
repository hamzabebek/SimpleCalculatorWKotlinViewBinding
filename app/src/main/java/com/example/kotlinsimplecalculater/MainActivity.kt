package com.example.kotlinsimplecalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.View
import androidx.core.view.accessibility.AccessibilityViewCommand.MoveWindowArguments
import com.example.kotlinsimplecalculater.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1 : Int? = null
    var number2 : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun mySum (view : View){
        number1 = binding.numberText1.text.toString().toIntOrNull()
        number2 = binding.numberText2.text.toString().toIntOrNull()
        if(number1 == null || number2 == null){
            binding.resultText.text = "Error !!"
        }else{
            binding.resultText.text = "Result : ${number1!! + number2!!}"
        }
    }

    fun sub (view : View){
        number1 = binding.numberText1.text.toString().toIntOrNull()
        number2 = binding.numberText2.text.toString().toIntOrNull()
        if(number1 == null || number2 == null){
            binding.resultText.text = "Error !!"
        }else{
            binding.resultText.text = "Result : ${number1!! - number2!!}"
        }
    }
    fun multiply(view: View){
        number1 = binding.numberText1.text.toString().toIntOrNull()
        number2 = binding.numberText2.text.toString().toIntOrNull()
        if(number1 == null || number2 == null){
            binding.resultText.text = "Error !!"
        }else{
            binding.resultText.text = "Result : ${number1!! * number2!!}"
        }
    }
    fun div (view: View){
        number1 = binding.numberText1.text.toString().toIntOrNull()
        number2 = binding.numberText2.text.toString().toIntOrNull()
        if(number1 == null || number2 == null){
            binding.resultText.text = "Error !!"
        }else{
            binding.resultText.text = "Result : ${number1!! / number2!!}"
        }
    }
}