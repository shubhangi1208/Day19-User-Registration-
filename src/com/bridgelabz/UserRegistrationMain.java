package com.bridgelabz;
import java.util.Scanner;
public class UserRegistrationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        UserRegistration user = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" 1.To validate First Name \n 2.To validate Last Name \n 3.To Validate Email ID \n 4.Quit ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    UserRegistration.validFirstName();
                    break;
                case 2:
                    UserRegistration.validLastName();
                    break;
                case 3 :
                        UserRegistration.validEmail();
                    break;
                case 4:
                    System.out.println("Thank You ");
                    break;
            }

        } while (choice != 4);
    }
}
