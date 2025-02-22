package lancastermusichall.booking;

import lancastermusichall.calendar.Event;

import java.util.ArrayList;
import java.util.List;

public class BookingManager implements VenueBooking{

    public BookingManager(){}

    @Override
    public List<SeatingConfig> getSeatingConfigurations() {
        return List.of();
    }

    @Override
    public List<BookingHold> getBookingHoldDurations() {
        return List.of();
    }

    @Override
    public List<SpecialRequirement> getSpecialRequirements() {
        return List.of();
    }
}
