package com.glearning.client;

import java.util.Scanner;
import com.glearning.model.employee_details;
import com.glearning.service.CredentialService;

public class Profile_Generator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter First name of the Employee:     ");
        String firstName = sc.nextLaine();

        System.out.print("Please Enter Last name of the Employee:     ");
        String lastName = sc.nextLine();

        employee_details emp = new employee_details(firstName, lastName);

        System.out.println("Please Enter the Department from the following : ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        String dept = null;
        int option = sc.nextInt();

        switch (option) {

            case 1:
                dept = "tech";
                break;
            case 2:
                dept = "admin";
                break;
            case 3:
                dept = "hr";
                break;
            case 4:
                dept = "legal";
                break;

        }

// generate Email Address
        String emailAddress = CredentialService.generate_EmailAddress(emp.getFirstName(), emp.getLastName(), dept);
        emp.setEmailAddress(emailAddress);

// generate Password
        String password = CredentialService.generate_password(8);
        emp.setPassword(password);

// Show Credentials
        CredentialService.showcredentials(emp);

        sc.close();

    }

}
