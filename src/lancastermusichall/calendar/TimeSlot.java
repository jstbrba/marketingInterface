package lancastermusichall.calendar;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class TimeSlot {
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    public TimeSlot(LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    // Getter methods
    public LocalDate getDate() {
        return date;
    }
    public LocalTime getTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }

    public void printDetails() {
        System.out.println(date + ": Available slot from " + startTime + " to " + endTime);
    }
}
