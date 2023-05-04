package edu.yu.cs.com.project.main;

import edu.yu.cs.com.project.HotelInterface;
import edu.yu.cs.com.project.people.Employee;
import edu.yu.cs.com.project.people.Guest;

import java.util.ArrayList;

public class Hotel implements HotelInterface {
    ArrayList<Room> rooms;
    Employee[] employees;

    public Hotel(){}


    @Override
    public void setNumberOfRooms(int numRooms) {

    }

    @Override
    public int getNumberOfRooms() {
        return 0;
    }

    @Override
    public int getAvailRooms() {
        return 0;
    }

    @Override
    public int getOccupiedRooms() {
        return 0;
    }

    /**
     * Find all matching rooms with the given amount of beds
     *
     * @param beds
     * @return Room that matches
     */
    @Override
    public Room roomSearchByBeds(int beds) {
        return null;
    }

    /**
     * Search for room by the room number (should only return 1)
     * return the matching room object
     *
     * @param roomNum
     */
    @Override
    public Room roomSearchByNumber(int roomNum) {
        return null;
    }

    @Override
    public Guest findGuest(String name, int id) {
        return null;
    }
}
