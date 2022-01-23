package com.bridgelabz;
import java.util.Scanner;
public class UserRegistrationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        UserRegistration user = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" 1.To validate First Name \n 2.To validate Last Name \n 3.To Validate Email ID \n 4.To validate Mobile number  \n 5.Quit ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    user.validFirstName();
                    break;
                case 2:
                    user.validLastName();
                    break;
                case 3 :
                    user.validEmail();
                case 4:
                    user.validMobileNumber();
                    break;
                case 5:
                    System.out.println("Thank You ");
                    break;
            }

        } while (choice != 5);
    }
}
