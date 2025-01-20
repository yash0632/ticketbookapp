package ticket.booking;

import ticket.booking.Services.UserBookingService;
import ticket.booking.entities.User;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running Train Booking System");

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        UserBookingService userBookingService;

        try{
            userBookingService = new UserBookingService();
            while(option != 7){
                System.out.println("Choose Option");
                System.out.println("1. Sign up");
                System.out.println("2. Login");
                System.out.println("3. Fetch Bookings");
                System.out.println("4. Search Trains");
                System.out.println("5. Book a Seat");
                System.out.println("6. Cancel my Booking");
                System.out.println("7. Exit the App");
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        //Sign Up
                        System.out.println("Enter the username to signup");
                        String nameToSignUp = scanner.next();
                        System.out.println("Enter the password to signup");
                        String passwordToSignUp = scanner.next();
                        //User userToSignUp = new User(nameToSignUp,passwordToSignUp);
                        userBookingService.signUp(userToSignUp);
                        break;
                    case 2:
                        //Login
                        System.out.println("Enter the username to Login");
                        String nameToLogin = scanner.next();
                        System.out.println("Enter the Password to Login");
                        String password = scanner.next();

                }
            }
        }
        catch(IOException err){
            System.exit(1);
        }





    }
}
