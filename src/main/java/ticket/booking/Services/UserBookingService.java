package ticket.booking.Services;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class UserBookingService {

    private List<User> userList;

    private static final String USERS_PATH = "src/main/java/ticket/booking/localDb/users.json";
    private ObjectMapper objectMapper = new ObjectMapper();

    public UserBookingService() throws IOException{

        loadUserListFromFile();


    }

    public registerUser(String name,String password,String username){

            if(!checkUserPresent(username)){
                User user = new User(name,password,username);
                signUp(user);
            }
            else{

            }



    }

    private boolean checkUserPresent(String username){

            loadUserListFromFile();
            boolean isUserPresent = false;
            for(int i = 0;i < userList.size();i++){
                if(userList.get(i).getUsername().equals(username)){
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


    private boolean signUp(User user) throws IOException{
        try{
            userList.add(user);
            saveUserListToFile();
            return true;
        }
        catch(IOException err) {
            return false;
        }
    }

    private void saveUserListToFile() throws IOException{
        try{
            objectMapper.writeValue(new File(USERS_PATH), userList );
        }
        catch(IOException err){
            System.out.println("Error in writing files to USER_PATH");
            System.exit(1);
        }

    }
}
