package edu.yu.cs.com.project.main;

import edu.yu.cs.com.project.HotelInterface;
import edu.yu.cs.com.project.people.Employee;
import edu.yu.cs.com.project.people.Guest;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements HotelInterface {
    private ArrayList<Room> rooms;
    private Employee[] employees;
    private String hotelName;

    public Hotel(String hotelName){
        this.hotelName = hotelName;
    }


    @Override
    public void setNumberOfRooms(int numRooms) {

    }

    @Override
    public int getNumberOfRooms() {
        return 0;
    }

    @Override
    public List<Room> getAvailRooms() {
        return null;
    }

    @Override
    public List<Room> getOccupiedRooms() {
        return null;
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
