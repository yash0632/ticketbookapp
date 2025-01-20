package ticket.booking.Services;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class UserBookingService {
    private User user;
    private List<User> userList;

    private static final String USERS_PATH = "src/main/java/ticket/booking/localDb/users.json";
    private ObjectMapper objectMapper = new ObjectMapper();

    public UserBookingService(User user) throws IOException {
        this.user = user;
        File users = new File(USERS_PATH);

        userList = objectMapper.readValue(users,new TypeReference<List<User>>(){});
    }


    public Boolean loginUser(){
        Optional<>
    }
}
