package ticket.booking.entities;

import lombok.Getter;
import lombok.Setter;
import ticket.booking.utils.UserServiceUtil;

import java.util.*;


public class User {
    @Getter
    private String username;
    private String name;
    @Getter
    private String hashedPassword;
    private List<Ticket> ticketsBooked;
    private String userId;

    public User(String name,String password,String username){
        this.username = username;
        this.name = name;
        this.hashedPassword = UserServiceUtil.hashPassword(password);
        this.ticketsBooked = new ArrayList<Ticket>();
        this.userId = UUID.randomUUID().toString();
    }

}
