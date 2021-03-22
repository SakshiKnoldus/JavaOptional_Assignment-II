package com.knoldus;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    void findPhoneByName() {
        String name = "Sakshi";
        Optional<String> getPhoneNumber = phoneBook.findPhoneByName(name);
        assert (getPhoneNumber.get().equals("7011101876"));
    }

    @Test
    void findNameByPhoneNumber() {
    String phoneNumber = "7011101876";
    Optional<String> getNameByPhoneNum = phoneBook.findNameByPhoneNumber(phoneNumber);
    assert (getNameByPhoneNum.get().equals("Sakshi"));
    }
}
