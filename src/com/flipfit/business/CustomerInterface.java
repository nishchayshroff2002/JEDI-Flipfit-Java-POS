package com.flipfit.business;

import com.flipfit.bean.*;

import java.util.Date;
import java.util.List;

public interface CustomerInterface {

    public boolean register();
    public boolean login();
    public boolean logout();
    public List<FlipFitGymCentre> viewAllGyms();
    public List<Slot> viewAllSlots(int centerId, Date date);
    public boolean bookSlot(int slotId,int centerId);
    public List<FlipFitBookingDetails> viewAllBookings();
    public boolean cancelBooking(int bookingId);
    public FlipFitCustomer viewMyProfile(int customerId);
}
