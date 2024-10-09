import com.flipfit.business.CustomerBusiness;
import com.flipfit.business.CustomerInterface;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        CustomerInterface business = new CustomerBusiness();
        business.login("Sneha","Sneha@123");
        business.logout();
        System.out.println("Register a customer :"+business.register());
        System.out.println("View all Bookings: "+business.viewAllBookings());
        System.out.println("View all Gyms : "+business.viewAllGyms()    );
        System.out.println("View all Bookings : "+business.viewAllBookings());
        System.out.println("Book a slot: "+business.bookSlot(1,1));
        business.cancelBooking(1);
        business.viewMyProfile(1);
    }
}