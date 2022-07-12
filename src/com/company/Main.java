package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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


        long result = number1 + number2;
        System.out.print("Результат сложения шестнадцетиричных чисел: ");
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
}