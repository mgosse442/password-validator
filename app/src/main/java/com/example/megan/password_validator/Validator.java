package com.example.megan.password_validator;

public class Validator {

    public static int validate(String password) {

        int rulesPassed = 0;

        //password is not "password"
        if (!password.toLowerCase().equals("password")) {
            rulesPassed++;
        }

        //password is at least 8 characters long
        if (password.length() >= 8) {
            rulesPassed++;
        }

        return rulesPassed;
    }
}