package lancastermusichall;

import lancastermusichall.calendar.Event;

import java.sql.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
    private final static String URL = "jdbc:mysql://sst-stuproj.city.ac.uk:3306/in2033t17";
    private final static String USER = "in2033t17_d";
    private final static String PASS = "qKvaIvobOa0";

    public List<Event> fetchEventsFromDB(){
        List<Event> events = new ArrayList<Event>();
        String query = "SELECT * FROM events";

        try (Connection connection = DriverManager.getConnection(URL,USER,PASS);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
                 while (resultSet.next()) {
                     int eventId = resultSet.getInt("eventId");
                     String eventName = resultSet.getString("eventName");
                     String eventType = resultSet.getString("eventType");
                     String room = resultSet.getString("room");
                     LocalDate date = resultSet.getDate("date").toLocalDate();
                     LocalTime startTime = resultSet.getTime("startTime").toLocalTime();
                     int durationMinutes = resultSet.getInt("duration");

                     Event event = new Event(eventId, eventName, eventType, room, date, startTime, Duration.ofMinutes(durationMinutes));
                     events.add(event);
                 }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return events;
    }
}
