package com.flipfit.business;

import java.util.Date;

public interface CustomerInterface {

    public boolean register();
    public boolean login();
    public boolean logout();
    public List<Gym> viewAllGyms();
    public List<Slot> viewAllSlots(int centerId,Date date);
    public boolean bookSlot(int slotId,int centerId);
    public List<Bookings> viewAllBookings();
    public boolean cancelBooking(int bookingId);
}
