package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration extends UserValidator {

    public void SelectOption() {
        while (true) {
            System.out.println("1. FirstName");
            System.out.println("2. LastName");
            System.out.println("3. Email");
            System.out.println("0. Exit");
            System.out.println("Enter option to check for Validation");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter your first name");
                    String firstName = sc.next();
                    firstNameValidation(firstName);
                    break;
                case 2:
                    System.out.println("Enter your Last name");
                    String LastName = sc.next();
                    lastNameValidation(LastName);
                    break;
                case 3:
                    System.out.println("Enter your Email");
                    String email = sc.next();
                    emailValidation(email);
                    break;
                case 0:
                    return;
            }
        }
    }
}