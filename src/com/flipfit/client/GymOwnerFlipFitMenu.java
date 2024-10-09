package com.flipfit.client;

import java.text.ParseException;
import java.util.Scanner;

public class GymOwnerFlipFitMenu {
    public static Scanner scanner = new Scanner(System.in);

    public boolean login() throws ParseException {
        System.out.println("Enter your username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        if (true) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Successfully logged in as Gym Owner");
            gymOwnerClientMainPage(userName, password);
        } else {
            System.out.println("Invalid credentials");
        }
        return true;
    }

    public boolean register() throws ParseException {
        System.out.println("Enter your username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        if (true) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Successfully registered  as Gym Owner");
            gymOwnerClientMainPage(userName, password);
        }
        return true;
    }



    public void gymOwnerClientMainPage(String userName, String password) throws ParseException {
        System.out.println("Welcome to gym owner main page!!");
        while (true) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("" +
                    "0. View all Gym Centres\n" +
                    "1. Send Gym Owner Approval Request\n" +
                    "2. Add new Gym Center\n" +
                    "3. Request Gym Centre Approval\n" +
                    "4. Add Slots to Gym Centre\n" +
                    "5. Go Back to Previous Menu"
            );
            System.out.println("---------------------------------------------------------------------------");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("View all gym centres");
                    break;
                case 1:
                    System.out.println("Gym owner request sent to Admin\n");
                    break;
                case 2:
                    String gymId ="";

                    System.out.println("Enter Gym Centre name: ");
                    String gymCentreName = scanner.next();

                    System.out.println("Enter Gym Centre GSTIN: ");
                    String gstin = scanner.next();

                    System.out.println("Enter Gym Centre city: ");
                    String city = scanner.next();

                    System.out.println("Enter Gym Centre capacity: ");
                    int capacity = scanner.nextInt();

                    System.out.println("Enter price: : ");
                    float price = scanner.nextFloat();
                    boolean isapproved = false;

                    System.out.println("New Gym center added\n");

                    break;

                case 3:
                    System.out.println("Enter gym centre Name: ");
                    String gymCentrename = scanner.next();
                    System.out.println("Request submitted for gym centre approval");
                    break;

                case 4:
                    System.out.println("Add slots to Gym Centre\n");
                    break;

                case 5:
                    System.out.println("Go Back to Previous Menu");
                    return;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }
};
