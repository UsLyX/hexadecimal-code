package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long result = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа из дисятичной системы исчисления для перевода в шестнадцатиричную \n");

        System.out.print("Введите первое число: ");
        long number1 = in.nextLong();
        System.out.print("Результат перевода в шестнадцатиричную систему исчисления: ");
        translationExpression(number1);
        System.out.println("\n");

        System.out.print("Введите второе число: ");
        long number2 = in.nextLong();
        System.out.print("Результат перевода в шестнадцатиричную систему исчисления: ");
        translationExpression(number2);
        System.out.println("\n");


        System.out.print("Введите арефметическую операцию над этими двумя числами: ");
        String operation = in.next();
        switch (operation) {
            case "+" -> {
                System.out.print("Результат сложения шестнадцетиричных чисел: ");
                result = plus(number1, number2);
            }
            case "-" -> {
                System.out.print("Результат вычитания шестнадцетиричных чисел: ");
                result = min(number1, number2);
            }
            case "*" -> {
                System.out.print("Результат умножения шестнадцетиричных чисел: ");
                result = mul(number1, number2);
            }
            case "/" -> {
                System.out.print("Результат деления шестнадцетиричных чисел: ");
                result = del(number1, number2);
            }
        }
        translationExpression(result);
        translationExpression(result);

    }
    static void array(String[] arr) {
        int i = 0;
        for (int k = arr.length - 1; k >= i; --k) {
            String temp = arr[k];
            if (arr[k] == null) {
                continue;
            }
            System.out.print(temp);
        }
    }
    static void translationExpression(long number){
        String[] arr = new String[20];
        int i = 0;
        long result = number / 16;
        long ost;
        while(number != 0) {
            ost = number - (result * 16);
            result /= 16;
            number /= 16;
            if (ost == 10) {
                ost = 'A';
                arr[i++] = Character.toString((char) ost);
                continue;
            }
            if (ost == 11) {
                ost = 'B';
                arr[i++] = Character.toString((char) ost);
                continue;
            }
            if (ost == 12) {
                ost = 'C';
                arr[i++] = Character.toString((char) ost);
                continue;
            }
            if (ost == 13) {
                ost = 'D';
                arr[i++] = Character.toString((char) ost);
                continue;
            }
            if (ost == 14) {
                ost = 'E';
                arr[i++] = Character.toString((char) ost);
                continue;
            }
            if (ost == 15) {
                ost = 'F';
                arr[i++] = Character.toString((char) ost);
                continue;
            }
            arr[i++] = String.valueOf(ost);
        }
        array(arr);
    }
    static long plus(long number1, long number2){
        return number1 + number2;
    }
    static long min(long number1, long number2){
        return number1 - number2;
    }
    static long mul(long number1, long number2){
        return number1 * number2;
    }
    static long del(long number1, long number2){
        return number1 / number2;
    }
}