
package com.flipfit.bean;

public class BookingDetails {
    private String bookingId;
    private String date;
    private String centreName;
    private String city;

    public BookingDetails(String bookingId, String date, String centreName, String city) {
        this.bookingId = bookingId;
        this.date = date;
        this.centreName = centreName;
        this.city = city;
    }

    // Getters and Setters
    public String getBookingId() {
        return bookingId;
    }

    public String getDate() {
        return date;
    }

    public String getCentreName() {
        return centreName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "bookingId='" + bookingId + '\'' +
                ", date=" + date +
                ", centreName='" + centreName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}