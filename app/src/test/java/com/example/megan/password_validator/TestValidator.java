package com.example.megan.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestValidator {

    @Test
    public void testValidPassword() {
        assertEquals(5, Validator.validate("abcZ12345"));
        assertEquals(5, Validator.validate("1234567890aA"));
    }

    @Test
    //test if password is "password"
    public void testIfPassword() {
        assertEquals(3, Validator.validate("Password"));
    }

    @Test
    //test if password is less than 8 characters long
    public void testIfLongEnough() {
        assertEquals(4, Validator.validate("myPW5"));
    }

    @Test
    //test if password doesn't contain a number
    public void testIfContainsNumber() {
        assertEquals(4, Validator.validate("Testeroo"));
    }

    @Test
    //test if password contains no lowercase letters
    public void testIfContainsLowerCase() {
        assertEquals(4, Validator.validate("AAAAAHHHHHHHH123"));
    }

    @Test
    //test if password contains no uppercase letters
    public void testIfContainsUpperCase() {
        assertEquals(4, Validator.validate("asofhopsfp9"));
    }
}