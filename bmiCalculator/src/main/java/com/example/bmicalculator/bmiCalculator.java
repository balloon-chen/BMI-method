package com.example.bmicalculator;

import java.util.Scanner;

public class bmiCalculator {

    public static void main(String[] args) {
        float weight, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入您的體重（kg）：");
        weight = scanner.nextFloat();
        System.out.println("請輸入您的身高（m）：");
        height = scanner.nextFloat();
        System.out.println("您的體重 BMI 是：" + bmiCalculator(weight, height));
    }

    public static float bmiCalculator(float weight, float height){
//        避免使用者使用公分做為身高的單位
        if (height > 100){
            height /= 100;
        }
        float bmi = weight / (height * height);
        if (bmi > 24){
            System.out.println("體重過重");
        }
        else if (bmi >= 18){
            System.out.println("正常體重");
        }
        else {
            System.out.println("體重過輕");
        }
        return bmi;
    }
}
