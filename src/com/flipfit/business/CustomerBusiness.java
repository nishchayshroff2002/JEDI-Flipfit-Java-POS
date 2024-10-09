package com.flipfit.business;

import com.flipfit.bean.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerBusiness implements  CustomerInterface{

    public static Scanner scanner = new Scanner(System.in);

    @Override
    public boolean register() {
        System.out.println("Enter your UserName");
        String userName = scanner.next();

        System.out.println("Enter your Password");
        String password = scanner.next();

        System.out.println("Enter your Email");
        String email = scanner.next();

        System.out.println("Enter your Phone Number");
        String phoneNumber = scanner.next();

        System.out.println("Enter your Card Number");
        String cardNumber = scanner.next();

        System.out.println("Customer registered successfullly");
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("Customer logged in successfullly");
        return true;
    }

    @Override
    public boolean logout() {
        System.out.println("Customer logged out successfullly");
        return true;
    }

    @Override
    public List<FlipFitGymCentre> viewAllGyms() {
        System.out.println("Here is the list of all gyms");
        List<FlipFitGymCentre> gyms = new ArrayList<>();

        gyms.add(new FlipFitGymCentre("G1", "O1", "Fit Nation", "GST1234", "New York", 100, 1, 20.0f));
        gyms.add(new FlipFitGymCentre("G2", "O2", "Power House Gym", "GST2345", "Los Angeles", 150, 1, 25.0f));
        gyms.add(new FlipFitGymCentre("G3", "O3", "Flex Gym", "GST3456", "Chicago", 120, 0, 30.0f));
        gyms.add(new FlipFitGymCentre("G4", "O4", "Iron Temple", "GST4567", "Miami", 80, 1, 15.0f));
        gyms.add(new FlipFitGymCentre("G5", "O5", "Health Hub", "GST5678", "Dallas", 200, 1, 18.0f));

        return gyms;
    }

    @Override
    public List<Slot> viewAllSlots(int centerId, Date date) {
        System.out.println("Here is the list of all slots");
        List<Slot> slots = new ArrayList<>();

        slots.add(new Slot(1, "G1", LocalDate.of(2024, 10, 10), LocalTime.of(6, 0), 10));
        slots.add(new Slot(2, "G1", LocalDate.of(2024, 10, 10), LocalTime.of(7, 0), 8));
        slots.add(new Slot(3, "G1", LocalDate.of(2024, 10, 10), LocalTime.of(8, 0), 5));
        slots.add(new Slot(4, "G2", LocalDate.of(2024, 10, 11), LocalTime.of(5, 30), 12));
        slots.add(new Slot(5, "G2", LocalDate.of(2024, 10, 11), LocalTime.of(6, 30), 6));
        slots.add(new Slot(6, "G2", LocalDate.of(2024, 10, 11), LocalTime.of(7, 30), 0));
        slots.add(new Slot(7, "G3", LocalDate.of(2024, 10, 12), LocalTime.of(9, 0), 15));

        return slots;

    }

    @Override
    public boolean bookSlot(int slotId, int centerId) {
        System.out.println("slot booking confirmed");
        return true;
    }

    @Override
    public List<FlipFitBookingDetails> viewAllBookings() {
        System.out.println("Here is the list of all bookings");

        List<FlipFitBookingDetails> bookings = new ArrayList<>();
        // Creating dummy data for bookings
        bookings.add(new FlipFitBookingDetails("B001", "2024-10-10", "Fit Gym", "New York"));
        bookings.add(new FlipFitBookingDetails("B002", "2024-10-11", "Power House", "Los Angeles"));
        bookings.add(new FlipFitBookingDetails("B003", "2024-10-12", "Health Club", "Chicago"));
        bookings.add(new FlipFitBookingDetails("B004", "2024-10-13", "Wellness Center", "Miami"));
        bookings.add(new FlipFitBookingDetails("B005", "2024-10-14", "Elite Fitness", "Houston"));
        bookings.add(new FlipFitBookingDetails("B006", "2024-10-15", "Ultimate Gym", "San Francisco"));
        bookings.add(new FlipFitBookingDetails("B007", "2024-10-16", "City Gym", "Seattle"));



        return bookings;
    }

    @Override
    public boolean cancelBooking(int bookingId) {
        System.out.println("Booking cancelled sucessfully");
        return true;
    }

    @Override
    public FlipFitCustomer viewMyProfile(int customerId) {
        System.out.println("Customer profile viewed successfully");
        return null;
    }
}
