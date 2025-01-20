package ticket.booking.Services;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.*;
import ticket.booking.utils.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class UserBookingService {
    private User user;

    private List<User> userList;

    private static final String USERS_PATH = "src/main/java/ticket/booking/localDb/users.json";
    private ObjectMapper objectMapper = new ObjectMapper();


    public UserBookingService() throws IOException{
        loadUserListFromFile();
    }

    public void registerUser(String name,String password,String username){
            if(!checkUserPresent(username)){
                User user = new User(name,password,username);
                signUp(user);
                System.out.println("User is Registered Properly!");
            }
            else {
                System.out.println("user is already Present! Please Login!");
            }
    }

    private boolean checkUserPresent(String username){
        loadUserListFromFile();
        boolean isUserPresent = false;
        for(int i = 0;i < userList.size();i++){
            if(userList.get(i).getUsername().equals(username)){
                user = userList.get(i);
                isUserPresent = true;
                break;
            }
        }
        return isUserPresent;
    }

    private void loadUserListFromFile(){
        try{
            userList = objectMapper.readValue(new File(USERS_PATH),new TypeReference<List<User>>(){});
        }
        catch(IOException err){
            System.out.println("Error in reading files from USER_PATH");
            System.exit(1);
        }

    }

    private void signUp(User user) {

        userList.add(user);
        saveUserListToFile();
    }

    private void saveUserListToFile(){
        try{
            objectMapper.writeValue(new File(USERS_PATH), userList );
        }
        catch(IOException err){
            System.out.println("Error in writing files to USER_PATH");
            System.exit(1);
        }

    }

    private void loginUser(String username,String password){
        if(checkUserPresent(username)){
            String hashedpassword = user.getHashedPassword();

            boolean isPasswordSame = UserServiceUtil.comparePassword(password,hashedpassword);


        }
        else{
            System.out.println("User is not present");
        }
    }
}
