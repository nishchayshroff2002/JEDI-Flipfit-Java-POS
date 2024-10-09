import com.flipfit.bean.FlipFitBookingDetails;
import com.flipfit.business.CustomerBusiness;
import com.flipfit.business.CustomerInterface;
import com.flipfit.business.BookingBusiness;
import com.flipfit.business.BookingInterface;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomerInterface business = new CustomerBusiness();
        BookingInterface booking=new BookingBusiness();
        business.login("Sneha","Sneha@123");
        business.logout();
        booking.makePayment();
        List<FlipFitBookingDetails> bdet = booking.getBookingByCustomerId("priya@123");
        System.out.println("Customer Details: ");
        bdet.forEach(val -> {System.out.println(val.getBookingId());
            System.out.println(val.getCentreName());
            System.out.println(val.getCity());
            System.out.println(val.getDate());
        });
        System.out.println("Register a customer :"+business.register());
        System.out.println("View all Bookings: "+business.viewAllBookings());
        System.out.println("View all Gyms : "+business.viewAllGyms()    );
        System.out.println("View all Bookings : "+business.viewAllBookings());
        System.out.println("Book a slot: "+business.bookSlot(1,1));
        business.cancelBooking(1);
        booking.checkBookingOverlap("1","2","12");
        business.viewMyProfile(1);
    }
}