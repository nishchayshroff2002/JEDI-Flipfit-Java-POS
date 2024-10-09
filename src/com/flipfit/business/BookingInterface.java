package com.flipfit.business;

import com.flipfit.bean.FlipFitBookingDetails;

import java.util.List;

/**
 * @author JEDI-09
 * Interface for Booking Service
 */
public interface BookingInterface {

    /**
     * Retrieves a list of bookings for the specified customer.
     *
     * @param  username  the username of the customer
     * @return a list of BookingDetails objects representing the customer's bookings
     */
    List<FlipFitBookingDetails> getBookingByCustomerId(String username);

    public boolean checkBookingOverlap(String customerID,String date,String time);
    /**
     * Cancels a booking for the specified customer.
     *
     * @param  bookingID  the ID of the booking to be cancelled
     */
    public boolean makePayment();
}