package edu.yu.cs.com.project.main;

import edu.yu.cs.com.project.RoomInterface;
import edu.yu.cs.com.project.people.Guest;

public class Room implements RoomInterface {
    Guest current_guest;
    boolean isBooked;
    int roomNum;

    public Room(int roomNum){
        this.roomNum = roomNum;
        this.isBooked = false;
        this.current_guest = null;
    }

    @Override
    public Guest getCurrentGuest() {
        return null;
    }

    /**
     * Get type of room
     */
    @Override
    public Type getRoomType() {
        return null;
    }

    /**
     * Set new roomType
     *
     * @param t
     */
    @Override
    public void setRoomType(Type t) {

    }

    @Override
    public boolean isOccupied() {
        return false;
    }
}
