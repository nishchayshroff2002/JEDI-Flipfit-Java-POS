package com.flipfit.client;
import com.flipfit.business.CustomerBusiness;
import com.flipfit.business.CustomerInterface;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CustomerFlipFitMenu {
    public static Scanner scanner = new Scanner(System.in);
    CustomerInterface customerService = new CustomerBusiness();

    public void customerClientMainPage(String username, String customerId) {
        System.out.println("Welcome to customer main page!!");
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Login TIME: "+currentTime);

        while(true) {
            System.out.println("1. View Profile \n2. Book a slot in Gym \n3. View Bookings\n4. Cancel Bookings\n5. View all Gyms");
            System.out.println("---------------------------------------------------------------------------");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Viewing Customer Profile");
                    customerService.viewMyProfile(1);
                    break;
                case 2:
                    System.out.println("Book a slot in gym");
                    customerService.bookSlot(1,1);
                    break;
                case 3:
                    System.out.println("Viewing all Available Bookings");
                    customerService.viewAllBookings();
                    break;
                case 4:
                    customerService.cancelBooking(1);
                    break;

                case 5:
                    customerService.viewAllGyms();
                    break;
                default:
                    System.out.println("INVALID_CHOICE_ERROR");
                    break;
            }
        }
    }
}