package com.example.circleandsquareareas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int X = 4;
        double circleArea = Math.PI * X * X;
        System.out.println("Площадь круга = " + circleArea);

        double squareArea = X * X;
        System.out.println("Площадь квадрата = " + squareArea);

        if (circleArea > squareArea) {
            System.out.println("Площадь круга больше площади квадрата");
        } else if (circleArea < squareArea) {
            System.out.println("Площадь круга меньше площади квадрата");
        } else
            System.out.println("Площадь круга равна площади квадрата");
    }

}