package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public void validFirstName(){
        System.out.print("Enter the First Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{3,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            System.out.println("First name is Valid");
        else
            System.out.println("First name is Invalid");
    }
    public void validLastName(){
        System.out.print("Enter the Last Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{3,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            System.out.println("Last Name is Valid");
        else
            System.out.println("Last Name is Invalid");
    }
    public void validEmail() {
        System.out.println("Enter the Email ID");
        String email = scanner.next();
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean r = m.matches();
        if (r)
            System.out.println("Email is valid");
        else
            System.out.println("Email is Invalid");
    }
    public void validMobileNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number : ");
        String phoneNo = scanner.nextLine();
        String regex3 = "^[9,1]{2}\\s[0-9]{10}$";
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3)
            System.out.println("Phone number is Valid");
        else
            System.out.println("Phone number is Invalid");
    }
    public void validPassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = scanner.next();
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()<>]).{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean r = m.matches();
        if (r)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
}