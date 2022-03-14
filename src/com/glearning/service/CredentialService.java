package com.glearning.service;

import java.util.Random;

import com.glearning.model.employee_details;

public class CredentialService {

// generates email address

    public final static String generate_EmailAddress(String firstName, String lastName, String dept) {
        return (firstName + lastName + "@" + dept + ".company.com ");
    }

//generate password

    public final static String generate_password(int length) {
        String capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallletters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String specialcharacters = "!@#$%^&*_=+-/.?<>)";
        String seed = capitalletters + smallletters + numbers + specialcharacters;

        char[] password = new char[length];
        Random random = new Random();
        for (int index = 0; index < length; index++) {
            int randomNumber = random.nextInt(seed.length());
            char c = seed.charAt(randomNumber);
            password[index] = c;
        }
        return password.toString();

    }

//displays credentials

    public static void showcredentials(employee_details emp) {
        System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follow");

        System.out.println("Email        --->  " + emp.getEmailAddress());
        System.out.println("Password     --->  " + emp.getPassword());
    }

}
