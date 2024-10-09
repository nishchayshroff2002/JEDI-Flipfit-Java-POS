package com.flipfit.bean;
import java.time.LocalDate;
import java.time.LocalTime;
public class Slot {
    private int slotId;
    private String gyn_id;

    public String getGyn_id() {
        return gyn_id;
    }

    public void setGyn_id(String gyn_id) {
        this.gyn_id = gyn_id;
    }

    public int getAvaiLableSeats() {
        return avaiLableSeats;
    }

    public void setAvaiLableSeats(int avaiLableSeats) {
        this.avaiLableSeats = avaiLableSeats;
    }

    public LocalDate getSlot_date() {
        return slot_date;
    }

    public void setSlot_date(LocalDate slot_date) {
        this.slot_date = slot_date;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public LocalTime getSlot_time() {
        return slot_time;
    }

    public void setSlot_time(LocalTime slot_time) {
        this.slot_time = slot_time;
    }

    private LocalDate slot_date;
    private LocalTime slot_time;
    private int avaiLableSeats;

}
