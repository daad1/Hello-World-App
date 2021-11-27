package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numberOne : Int = 10
        var numberTwo : Int = 5
        var operator : String = "/"


        calculate(numberOne , numberTwo , operator)


    }

  fun calculate (numberOne: Int  , numberTwo:Int   , operator: String? ) {
      var result = 0
      if (operator == "/") {

          result = numberOne / numberTwo

      } else if (operator == "*") {

          result = numberOne * numberTwo

      } else if (operator == "+") {

          result = numberOne + numberTwo

      } else if (operator == "-") {

          result = numberOne - numberTwo
      }
      println("The result of operator is : $numberOne $operator $numberTwo ")


  }
}