import lancastermusichall.calendar.Event;
import lancastermusichall.calendar.OperationsCalendar;
import lancastermusichall.calendar.TimeSlot;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] rooms = {"Main Hall", "Small Hall"};
        String[] types = {"Event","Film"};

        Event e1 = new Event(
                1,
                "E1",
                types[rand.nextInt(rooms.length)],
                rooms[rand.nextInt(rooms.length)],
                LocalDate.of(2025,1,12),
                LocalTime.of(12,30),
                Duration.ofMinutes(120)
        );
        Event e2 = new Event(
                2,
                "E2",
                types[rand.nextInt(rooms.length)],
                rooms[rand.nextInt(rooms.length)],
                LocalDate.of(2025,1,12),
                LocalTime.of(12,30),
                Duration.ofMinutes(120)
        );
        Event e3 = new Event(
                3,
                "E3",
                types[rand.nextInt(rooms.length)],
                rooms[rand.nextInt(rooms.length)],
                LocalDate.of(2025,1,12),
                LocalTime.of(12,30),
                Duration.ofMinutes(120)
        );

        OperationsCalendar calendar = new OperationsCalendar();
        calendar.addEvent(e1);
        calendar.addEvent(e2);
        calendar.addEvent(e3);


        System.out.println("SCHEDULE: ");
        List<Event> schedule = calendar.getShowSchedule();
        for (Event e : schedule) {
            e.printDetails();
            System.out.println();
        }

        System.out.println("AVAILABLE SLOTS IN MAIN HALL: ");
        List<TimeSlot> available = calendar.getAvailableGaps();
        for (TimeSlot t : available) {
            t.printDetails();
        }

        System.out.println();
        System.out.println("AVAILABLE MEETING ROOMS FOR THE NEXT WEEKS: ");
        List<TimeSlot> availableMeetings = calendar.getMeetingRoomAvailability("M1");
        for (TimeSlot t : availableMeetings) {
            t.printDetails();
        }
    }
}
