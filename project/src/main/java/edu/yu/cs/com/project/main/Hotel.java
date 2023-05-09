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
    private ArrayList<Reservation> reservations;
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
        return this.rooms.size();
    }

    @Override
    public List<Room> getAvailRooms() {
        return this.rooms;//filter through to see aviable
    }

    @Override
    public List<Room> getOccupiedRooms() {
        return null;//filter throught to see which ones are booked
    }

    /**
     * Find all matching rooms with the given amount of capacity
     *
     * @param beds
     * @return Room that matches
     */
    @Override
    public List<Room> roomSearchByCap(int cap) {
        ArrayList<Room> results = new ArrayList<>();
        switch (cap){
            case 1:
                //return all rooms with single beds
                results.addAll(getAllRooms(Type.SINGLE));
                break;
            case 2:
                //return all double rooms
                results.addAll(getAllRooms(Type.TWO_BED));
                break;
            case 3:
                //suits
                results.addAll(getAllRooms(Type.SUITE));
                break;
            case 4:
                //return all suit rooms
                results.addAll(getAllRooms(Type.SUITE));
                break;
            case 5:
                //return all suite rooms
                results.addAll(getAllRooms(Type.SUITE));
                break;
            case 6:
                //return presdident room
                results.addAll(getAllRooms(Type.PRESIDENTIAL));
                break;
            case 7:
                //return president room
                results.addAll(getAllRooms(Type.PRESIDENTIAL));
                break;
            default:
                //room doesnt exists
        }
        return results;
    }

    private List<Room> getAllRooms(RoomInterface.Type type){
        ArrayList<Room> results = new ArrayList<>();
        for(Room r : this.rooms){
            if(r.getRoomType() == type){
                results.add(r);
            }
        }
        return results;
    }

    /**
     * Search for room by the room number (should only return 1)
     * return the matching room object
     *
     * @param roomNum
     */
    @Override
    public Room roomSearchByNumber(int roomNum) {
        return this.rooms.get(roomNum - 1);
    }

    @Override
    public Guest findGuest(String name, int id) {
        Guest temp = new Guest(name,id);
        for(Room r : this.rooms){
            if(r.getCurrentGuest().equals(temp)){
                return r.getCurrentGuest();
            }
        }
        return null; //coudnt find guesr
    }

    @Override
    public boolean setReservation(Reservation reservation) {
        return false;
    }
}
