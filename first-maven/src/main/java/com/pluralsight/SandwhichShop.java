package com.pluralsight;

import java.util.Scanner;

public class SandwhichShop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select size of sandwich");
        System.out.println("Regular base price $5.45 (Enter 1) ");
        System.out.println("Large base price $9.95 (Enter 2) ");
        int sandwichSize = input.nextInt();
        double basePrice = 0.0;

        if (sandwichSize == 1) {
            basePrice = 5.45;
        } else if (sandwichSize == 2) {
            basePrice = 9.95;

        }

        double finalPrice = (basePrice);

        System.out.println("Please Enter Your Age");
        int age = input.nextInt();

        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }


        finalPrice = basePrice - (basePrice * discount);
        System.out.println("Final price after discount: $" + finalPrice);
    }
}
