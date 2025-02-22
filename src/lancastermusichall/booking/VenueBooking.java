package lancastermusichall.booking;

import java.util.List;

public interface VenueBooking {
    List<SeatingConfig> getSeatingConfigurations();
    List<BookingHold> getBookingHoldDurations();
    List<SpecialRequirement> getSpecialRequirements();
}
