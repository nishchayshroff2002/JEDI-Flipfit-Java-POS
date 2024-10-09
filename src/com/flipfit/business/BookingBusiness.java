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
        FlipFitBookingDetails obj=new FlipFitBookingDetails("kjdn","jd","nwd","delhi");
        List<FlipFitBookingDetails> bookings = Collections.singletonList(obj);
        return bookings;
    }

    @Override
    public void cancelBooking(String bookingID) {
        System.out.println("This is the booking service");
    }
}