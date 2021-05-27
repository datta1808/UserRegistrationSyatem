package com.bridgelabz;

public class UserValidator {

    public void firstNameValidation(String firstName) {
        boolean validation = firstName.matches("^[A-Z][a-z]{2,}$");
        System.out.println("Name: " + firstName + "\nValid: " + validation);
        if(validation) {
            System.out.println("First Name is Valid");
        } else {
            System.out.println("Invalid. \n Enter a valid name");
        }
    }

    public void lastNameValidation (String lastName){
        boolean validation = lastName.matches("^[A-Z][a-z]{2,}$");
        if(validation) {
            System.out.println("Last Name is Valid");
        } else {
            System.out.println("Invalid. \n Enter a valid Name");
        }
    }

    public void emailValidation (String email){
        boolean validation = email.matches("^[a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,3})?$");
        if(validation) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Invalid. \n Enter a valid Email");
        }
    }

    public void mobileValidation (String mobile){
        boolean validation = mobile.matches("^[9][1][ ][0-9]{10}$");
        if(validation) {
            System.out.println("Mobile number is Valid");
        } else {
            System.out.println("Invalid. \n Enter a valid mobile number");
        }
    }

    public void passwordValidation (String password){
        boolean validation = password.matches("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}");
        if(validation) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Invalid. \n Enter a valid Password");
        }
    }
}