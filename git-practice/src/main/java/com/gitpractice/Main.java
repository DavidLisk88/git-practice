package com.gitpractice;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int number = 30;
        int number1 = 47;
        double decimal= 4.99;

        if(number > 25){
            System.out.println(Math.PI * number / 5.7);
            if(number1 < 50){
                System.out.println(Math.PI * number1 * 20 / 7.8);
                if(decimal > 2.3){
                    System.out.println(Math.PI * decimal * 45 / 3);
                }
            }

            double firstResult = Math.PI * number / 5.7;
            double secondResult = Math.PI * number1 * 20 / 7.8;
            double lastResult = Math.round(Math.PI * decimal * 45 / 3);

            if(lastResult > 2){
                System.out.println(Math.round(firstResult + secondResult + lastResult));
            }

        }


    }
}