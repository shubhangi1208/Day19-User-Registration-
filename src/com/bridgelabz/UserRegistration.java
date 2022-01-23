package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static void validFirstName(){
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
    public static void validLastName(){
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
}