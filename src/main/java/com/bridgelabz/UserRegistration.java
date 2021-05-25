package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration extends UserValidator {

    public void SelectOption() {
        while (true) {
            System.out.println("1.FirstName");
            System.out.println("Enter option to check for Validation");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter your first name");
                    String firstName = sc.next();
                    firstNameValidation(firstName);
                    break;
                case 6:
                    return;
            }
        }
    }
}