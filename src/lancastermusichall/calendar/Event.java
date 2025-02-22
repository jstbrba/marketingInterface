package lancastermusichall.calendar;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
    private int eventId;
    private String eventName;
    private String eventType;
    private String room;
    private LocalDate date;
    private LocalTime startTime;
    private Duration duration;

    public Event(int eventId, String eventName, String eventType, String room, LocalDate date, LocalTime startTime, Duration duration) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventType = eventType;
        this.room = room;
        this.date = date;
        this.startTime = startTime;
        this.duration = duration;
    }
    // Getter methods
    public int getEventId() {
        return eventId;
    }
    public String getEventName(){
        return eventName;
    }
    public String getEventType(){
        return eventType;
    }
    public String getRoom(){
        return room;
    }
    public LocalDate getDate(){
        return date;
    }
    public LocalTime getStartTime(){
        return startTime;
    }
    public Duration getDuration(){
        return duration;
    }
    public LocalTime getEndTime(){
        return startTime.plus(duration);
    }

    // Setter methods
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public void setStartDate(LocalDate date) {
        this.date = date;
    }
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    // View
    public void printDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Type: " + eventType);
        System.out.println("Room: " + room);
        System.out.println("Date: " + date);
        System.out.println("Start: " + startTime + " - " + getEndTime());;
        System.out.println("Duration: " + duration);
    }
}
