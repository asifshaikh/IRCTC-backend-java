package ticket.booking.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entitites.User;

import java.io.File;

public class UserBookingService  {
    private User user;
    private ObjectMapper objectMapper = new ObjectMapper(); // to make object serialize(to store object in json format) and de-serialize(to bring back object from json)
    private static final String USERS_PATH ="../localDb/users.json";
    public UserBookingService(User user1){
    this.user = user1;
        File users = new File(USERS_PATH);
    }
}
