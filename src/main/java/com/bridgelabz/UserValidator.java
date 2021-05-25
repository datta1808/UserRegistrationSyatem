package com.bridgelabz;

public class UserValidator {

    public void firstNameValidation(String firstName) {
        boolean validation = firstName.matches("^[A-Z][a-z]{2,}$");
        System.out.println("Name: " + firstName + "\nValid: " + validation);
    }

    public void lastNameValidation (String lastName){
        boolean validation = lastName.matches("^[A-Z][a-z]{2,}$");
        System.out.println("Name: " + lastName + "\nValid: " + validation);
    }

    public void emailValidation (String email){
        boolean validation = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
        System.out.println("Name: " + email + "\nValid: " + validation);
    }

    public void mobileValidation (String mobile){
        boolean validation = mobile.matches("^[1-9][0-9]+[ ]?+[1-9][0-9]{9}$");
        System.out.println("Name: " + mobile + "\nValid: " + validation);
    }
}