package com.flipfit.business;

import com.flipfit.bean.FlipFitBookingDetails;

import java.util.Collections;
import java.util.List;

/**
 * Implementation of Booking Service.
 */
public class BookingBusiness implements BookingInterface{


    @Override
    public List<FlipFitBookingDetails> getBookingByCustomerId(String username){

        FlipFitBookingDetails obj=new FlipFitBookingDetails("23","30/10/24","Banglore","delhi");
        List<FlipFitBookingDetails> bookings = Collections.singletonList(obj);
        return bookings;
    }

    @Override
    public boolean checkBookingOverlap(String customerID, String date, String time) {
        System.out.println("This is my booking overlap");
        return true;
    }

    @Override
    public boolean makePayment() {
        System.out.println("This is my payment function");
        return true;
    }
}