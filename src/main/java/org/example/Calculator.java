package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculator
{
    public static float num1;
    public static float num2;
    public static String arithmeticOperation;
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическую операцию");
        arithmeticOperation = scanner.nextLine();

        System.out.println("Введите 1-ое число");
        num1 = scanner.nextFloat();

        System.out.println("Введите 2-ое число");
        num2 = scanner.nextFloat();

        switch (arithmeticOperation){
            case "+":
                System.out.println(Sum(num1,num2));
            case "-":
                System.out.println(Dif(num1,num2));
            case "*":
                System.out.println(Prod(num1,num2));
            case "/":
                System.out.println(Div(num1,num2));

        }

        scanner.close();
    }

    public static float Sum(float num1, float num2) {
        return num1 + num2;
    }
    public static float Dif(float num1, float num2) {
        return num1 - num2;
    }
    public static float Prod(float num1, float num2) {
        return num1 * num2;
    }
    public static float Div(float num1, float num2) {
        return num1 / num2;
    }
    public int sum(int a,int b){
        return a+b;
    }

}
