package com.pluralsight;

public class Mathapp {
    public static void main(String[] args) {
//        Question 1
        int bobSalary = 91000;
        int garySalary = 75000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The answer is " + highestSalary);
//Question 2
        int carPrice = 2399;
        int truckPrice = 9287;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price " + lowestPrice);

//Question 3
        double radiusOfCircle = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);
        System.out.println("The lowest price is " + areaOfCircle);

        // Question 4:
        double number = 5.0;
        double result = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + result);

//        Question 6

    }


// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
}
