package com.flipfit.business;

import com.flipfit.bean.Customer;
import com.flipfit.bean.GymOwner;
import com.flipfit.bean.Gymcentre;
import com.flipfit.bean.Slot;

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
    public List<Gymcentre> viewAllGyms() {
        System.out.println("Here is the list of all gyms");
        List<String> gyms = new ArrayList<>();
        gyms.add("Fit Nation");
        gyms.add("Power House Gym");
        gyms.add("Flex Gym");
        gyms.add("Iron Temple");
        gyms.add("Health Hub");
        return gyms;
    }

    @Override
    public List<Slot> viewAllSlots(int centerId, Date date) {
        System.out.println("Here is the list of all slots");
        List<String> slots = new ArrayList<>();

        slots.add("6:00 AM");
        slots.add("7:00 AM");
        slots.add("8:00 AM");
        slots.add("9:00 AM");
        slots.add("10:00 AM");
        slots.add("4:00 PM");
        slots.add("5:00 PM");
        slots.add("6:00 PM");
        slots.add("7:00 PM");
        return slots;
    }

    @Override
    public boolean bookSlot(int slotId, int centerId) {
        System.out.println("slot booking confirmed");
        return true;
    }

    @Override
    public List<Bookings> viewAllBookings() {
        System.out.println("Here is the list of all bookings");
        List<String> bookings = new ArrayList<>();
        bookings.add("6:00 AM - John Doe");
        bookings.add("7:00 AM - Jane Smith");
        bookings.add("8:00 AM - Alex Johnson");
        bookings.add("9:00 AM - Emily Davis");
        bookings.add("10:00 AM - Michael Brown");
        bookings.add("4:00 PM - Sarah Wilson");
        bookings.add("5:00 PM - David Lee");
        bookings.add("6:00 PM - Anna Taylor");
        bookings.add("7:00 PM - Chris Martin");
        return bookings;
    }

    @Override
    public boolean cancelBooking(int bookingId) {
        System.out.println("Booking cancelled sucessfully");
        return true;
    }

    @Override
    public Customer viewMyProfile(int customerId) {
        return null;
    }
}
