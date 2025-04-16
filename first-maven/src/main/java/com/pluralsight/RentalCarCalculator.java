package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double dailyRentalRate = 29.99;
        double gpsRate = 2.95;
        double tollTagRate = 3.95;
        double underAgeDriver = (29.99 * 0.3);
        double roadSideAssistance = 3.95;
        int underAgeLimit = 25;

        System.out.println("Please Enter Pickup Date: ");
        String pickUpDate = scanner.nextLine();

        System.out.println("Enter Desired Days Of Rental: ");
        int daysRented = scanner.nextInt();

        System.out.println("Do you they want an electric toll tag at $3.95/day (yes/no)");
        String tollResponse = scanner.nextLine();

        System.out.println("Do You Want to Add GPS at $3.95/day (yes/no)");
        String gpsResponse = scanner.nextLine();

        System.out.println("Do want roadside assistance at $3.95/day (yes/no)");
        String roadSideResponse = scanner.nextLine();

        System.out.println("Enter Your Age ");
        int age = scanner.nextInt();

//        Calculation

        double total = dailyRentalRate * daysRented;{

        }








    }
}
;;