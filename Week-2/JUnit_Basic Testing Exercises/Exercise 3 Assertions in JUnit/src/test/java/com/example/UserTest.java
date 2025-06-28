package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testUserName() {
        User user = new User("Shayam", 20);
        assertEquals("Shayam", user.getName(), "Name should be Shayam");
    }

    @Test
    void testUserAge() {
        User user = new User("Shayam", 20);
        assertTrue(user.getAge() > 0, "Age should be greater than 0");
        assertEquals(20, user.getAge());
    }

    @Test
    void testIsAdult() {
        User user = new User("Shayam", 20);
        assertTrue(user.isAdult(), "User should be an adult");

        User minor = new User("Mini", 15);
        assertFalse(minor.isAdult(), "User should not be an adult");
    }

    @Test
    void testNotNull() {
        User user = new User("Shayam", 20);
        assertNotNull(user.getName(), "Name should not be null");
    }
}
