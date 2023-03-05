package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testCreationUserWithTwoParameters() {
        User user1 = new User("Alex", "Alex@jupiter.part");
        assertEquals(user1.getLogin(), "Alex");
        assertEquals(user1.getEmail(), "Alex@jupiter.part");
    }

    @Test
    void testCreationUserWithoutParameters() {
        User user = new User();
        assertEquals(user.getLogin(), "login");
        assertEquals(user.getEmail(), "mail@mail.mail");
    }

    @Test
    void testEmailIsValid() {

        assertThrows(IllegalArgumentException.class, () -> new User("Alex", "Alex&jupiter.part"));
        assertThrows(IllegalArgumentException.class, () -> new User("Alex", "Alex@jupiter,part"));

//        User user1 = new User("Alex", "Alex&jupiter.part");
//        User user2 = new User("Alex", "Alex@jupiter,part");

//        assertFalse(user1.isValid());
//        assertFalse(user2.isValid());
    }

    @Test
    void testLoginNotEqualsEmail() {

        assertThrows(IllegalArgumentException.class, () -> new User("Alex@jupiter.part", "Alex@jupiter.part"));

//        User user1 = new User("Alex@jupiter.part", "Alex@jupiter.part");
//
//        assertFalse(user1.isValid());
    }
}