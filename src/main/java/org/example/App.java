package org.example;

import java.util.Scanner;

public class App {
    public static float num1;
    public static float num2;
    public static String arithmeticOperation;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическую операцию");
        arithmeticOperation = scanner.nextLine();
        System.out.println("Введите 1-ое число");
        num1 = scanner.nextFloat();
        System.out.println("Введите 2-ое число");
        num2 = scanner.nextFloat();
        switch (arithmeticOperation) {
            case "+":
                System.out.println(Calculator.sum(num1, num2));
                break;
            case "-":
                System.out.println(Calculator.dif(num1,num2));
                break;
            case "*":
                System.out.println(Calculator.prod(num1,num2));
                break;
            case "/":
                System.out.println(Calculator.div(num1,num2));
                break;
            default: throw new ArithmeticException("u stopid");
        }
        scanner.close();
    }
    public String readOperaton(){
        return null;
    }
    public String readValue(){
        return null;
    }


}