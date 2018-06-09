package com.example.megan.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestValidator {

    @Test
    public void testValidPassword() {
        assertEquals(2, Validator.validate("pppppppassword"));
        assertEquals(2, Validator.validate("1234567890"));
    }

    @Test
    public void testInvalidPassword() {
        //test if password is "password"
        assertEquals(1, Validator.validate("Password"));

        //test if password is less than 8 characters long
        assertEquals(1, Validator.validate("mypw"));
    }
}