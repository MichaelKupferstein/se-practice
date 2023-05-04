package edu.yu.cs.com.project;

import edu.yu.cs.com.project.main.Reservation;
import edu.yu.cs.com.project.main.Room;
import edu.yu.cs.com.project.people.Guest;

import java.util.List;

public interface HotelInterface {
    public void setNumberOfRooms(int numRooms);
    public int getNumberOfRooms();
    public List<Room> getAvailRooms();
    public List<Room> getOccupiedRooms();
    /**
     * Find all matching rooms with the given amount of beds
     * @return Room that matches
     */
    public Room roomSearchByBeds(int beds);

    /**Search for room by the room number (should only return 1)
     *return the matching room object
     */
    public Room roomSearchByNumber(int roomNum);

    public Guest findGuest(String name, int id);

    /**
     * Book a reservation
     * @return true if it booked successfully and false if not
     * */
    public boolean setReservation(Reservation reservation);


}
