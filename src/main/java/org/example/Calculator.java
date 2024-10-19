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
                System.out.println(sum(num1,num2));
            case "-":
                System.out.println(dif(num1,num2));
            case "*":
                System.out.println(prod(num1,num2));
            case "/":
                System.out.println(div(num1,num2));
        }
        scanner.close();


    }

    public static float sum(float num1, float num2) {
        return num1 + num2;
    }
    public static float dif(float num1, float num2) {
        return num1 - num2;
    }
    public static float prod(float num1, float num2) {
        return num1 * num2;
    }
    public static float div(float num1, float num2) {
        return num1 / num2;
    }

}
