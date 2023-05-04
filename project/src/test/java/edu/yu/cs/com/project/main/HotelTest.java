package edu.yu.cs.com.project.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void setNumberOfRooms() {
        Hotel hotelTest = new Hotel("Jz");
        hotelTest.setNumberOfRooms(101);
        System.out.println(hotelTest.getAvailRooms());
    }

    @Test
    void getNumberOfRooms() {
    }

    @Test
    void getAvailRooms() {
    }

    @Test
    void getOccupiedRooms() {
    }

    @Test
    void roomSearchByBeds() {
    }

    @Test
    void roomSearchByNumber() {
    }

    @Test
    void findGuest() {
    }
}