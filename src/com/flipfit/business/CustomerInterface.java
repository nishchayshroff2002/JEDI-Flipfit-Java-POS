package com.flipfit.business;

import com.flipfit.bean.*;

import java.util.Date;
import java.util.List;

public interface CustomerInterface {

    public boolean register();
    public boolean login(String username,String password);
    public boolean logout();
    public List<Gymcentre> viewAllGyms();
    public List<Slot> viewAllSlots(int centerId, Date date);
    public boolean bookSlot(int slotId,int centerId);
    public List<BookingDetails> viewAllBookings();
    public boolean cancelBooking(int bookingId);
    public Customer viewMyProfile(int customerId);
}
