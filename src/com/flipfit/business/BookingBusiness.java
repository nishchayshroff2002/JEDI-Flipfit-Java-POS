package com.flipfit.business;

import com.flipfit.bean.BookingDetails;

import java.util.Collections;
import java.util.List;

/**
 * Implementation of Booking Service.
 */
public class BookingBusiness implements BookingInterface{

    @Override
    public List<BookingDetails> getBookingByCustomerId(String username){
        BookingDetails obj=new BookingDetails("kjdn","jd","nwd","delhi");
        List<BookingDetails> bookings = Collections.singletonList(obj);
        return bookings;
    }

    @Override
    public void cancelBooking(String bookingID) {
        System.out.println("This is the booking service");
    }
}