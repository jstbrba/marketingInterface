package lancastermusichall.calendar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface VenueCalendar {
    List<Event> getShowSchedule();
    List<VenueSpace> getReservedSpace();
    List<TimeSlot> getAvailableGaps();
    List<RestrictedBooking> getRestrictedBookings();
    List<TimeSlot> getMeetingRoomAvailability(String room); //  WITHIN THREE WEEKS
}
