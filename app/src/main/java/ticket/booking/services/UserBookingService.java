package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entitites.User;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingService  {
    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper(); // to make object serialize(to store object in json format) and de-serialize(to bring back object from json)

    private static final String USERS_PATH ="../localDb/users.json";

    public UserBookingService(User user1) throws IOException {
        this.user = user1;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        });

    }
}
