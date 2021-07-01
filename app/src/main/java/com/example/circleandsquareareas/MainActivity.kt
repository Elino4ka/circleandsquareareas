package com.example.circleandsquareareas

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val X = 4
        val circleArea = Math.PI * X * X
        Log.d("DZ", "Площадь круга =$circleArea")
        val squareArea = (X * X).toDouble()
        Log.d("DZ", "Площадь квадрата =$squareArea")

        when {
            (circleArea > squareArea) -> {
                Log.d("DZ", "Площадь круга больше площади квадрата")
            }
            (circleArea < squareArea) -> {
                Log.d("DZ", "Площадь круга меньше площади квадрата")
            }
            else -> {
                Log.d("DZ", "Площадь круга равна площади квадрата")
            }
        }
    }
}