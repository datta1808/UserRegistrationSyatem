package com.bridgelabz;

public class UserValidator {
    public void firstNameValidation(String firstName) {
        boolean valid = firstName.matches("^[A-Z]{1}[a-z]{2,}$");
        System.out.println("Name: " + firstName + "\nValid: " + valid);
    }
}