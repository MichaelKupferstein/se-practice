package edu.yu.cs.com.project.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void setNumberOfRooms() {
        Hotel hotelTest = new Hotel("Jz");
        hotelTest.setNumberOfRooms(101);
        System.out.println(hotelTest.getAvailRooms());

        System.out.println(hotelTest.roomSearchByCap(1));
        System.out.println(hotelTest.roomSearchByCap(2));
        System.out.println(hotelTest.roomSearchByCap(3));
        System.out.println(hotelTest.roomSearchByCap(6));
        System.out.println(hotelTest.roomSearchByCap(10));

        System.out.println(hotelTest.roomSearchByNumber(2));
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