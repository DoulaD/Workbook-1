package com.pluralsight;


import java.util.Scanner;

public class BasicCalculator1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number");
        float firstNumber = input.nextFloat();
        System.out.println("Enter 2nd number");
        float secondNumber = input.nextFloat();

        input.nextLine(); // eating the enter line

        float result = firstNumber * secondNumber;

        System.out.println("result: " + result);

        String message = String.format("%.2f * %.2f = %.2f", firstNumber , secondNumber, result);
        System.out.println(message);}

}
