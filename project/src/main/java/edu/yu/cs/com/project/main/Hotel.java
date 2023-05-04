package edu.yu.cs.com.project.main;

import edu.yu.cs.com.project.HotelInterface;
import edu.yu.cs.com.project.RoomInterface;
import edu.yu.cs.com.project.RoomInterface.Type;
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
        this.rooms = new ArrayList<>();
    }


    @Override
    public void setNumberOfRooms(int numRooms) {
        //of the numbers of room, there is one presidnatial, then from the reaming 20% are suits, 50% are two bed 30% are single
        int numOfPres = 1;
        numRooms--;
        int numOfSuits = (int) Math.floor((20.0 / 100.0) * numRooms);
        int numOfDouble = (int) Math.floor((50.0 / 100.0) * numRooms);
        int numOfSingle = (int) Math.floor((30.0 / 100.0) * numRooms);
        numRooms++;
        int count = 1;
        count = createRooms(numOfSingle,count, Type.SINGLE);
        System.out.println(count);
        count = createRooms(numOfDouble,count, Type.TWO_BED);
        System.out.println(count);
        count = createRooms(numOfSuits,count, Type.SUITE);
        System.out.println(count);
        count = createRooms(numOfPres,count,Type.PRESIDENTIAL);
        createRooms(numRooms - count+1,count,Type.SINGLE);
    }

    private int createRooms(int numOfRoom, int roomNumber, Type type){
        for(int i = 0; i < numOfRoom; i++){
            Room newRoom = new Room(roomNumber);
            newRoom.setRoomType(type);
            this.rooms.add(newRoom);
            roomNumber++;
        }
        return roomNumber;
    }

    @Override
    public int getNumberOfRooms() {
        return 0;
    }

    @Override
    public List<Room> getAvailRooms() {
        return this.rooms;
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
