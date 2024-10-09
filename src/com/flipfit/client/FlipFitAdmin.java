package com.flipfit.client;

import java.util.Scanner;

public class  FlipFitAdmin {
    public static void menu(){

    System.out.println("Welcome to FlipFit Admin Menu");
    Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("0. View All Gym Owners\n1. Approve all gym owners requests\n2. Approve gym owner's request by Id\n" +
                    "3. View All Gym Centers\n4. Approve all gym centre requests\n5. Approve gym centre's request by Id\n6. Go Back To Previous Menu");
            System.out.println("---------------------------------------------------------------------------");

            int pendingChoice = scanner.nextInt();
            switch (pendingChoice) {
                case 0:
                    System.out.println("All Gym Owners lists");
                    break;
                case 1:
                    System.out.println("All gym owner requests approved");
                    break;
                case 2:
                    System.out.println("Enter Gym Owner ID to approve");
                    String gymOwnerId = scanner.next();
                    System.out.println("Gym owner: " + gymOwnerId + " request approved");
                    break;
                case 3:
                    System.out.println("All Gym centers list");
                    break;
                case 4:
                    System.out.println("All gym centre requests approved");
                    break;
                case 5:
                    System.out.println("Enter Gym Center ID to approve");
                    String gymCentreId = scanner.next();
                    System.out.println("Gym centre: " + gymCentreId + " request approved");
                    break;
                case 6:
                    return;
            }
        }
    }

    public static void login(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the email: ");
        String email = scanner.next();
        System.out.println("Enter the password: ");
        String password = scanner.next();

        System.out.println("Successfully logged in");
        menu();

    }

}
