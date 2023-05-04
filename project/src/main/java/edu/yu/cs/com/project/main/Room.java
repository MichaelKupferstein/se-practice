package edu.yu.cs.com.project.main;

import edu.yu.cs.com.project.RoomInterface;
import edu.yu.cs.com.project.people.Guest;

public class Room implements RoomInterface {
    Guest current_guest;
    boolean isBooked;
    int roomNum;
    Type roomType;

    public Room(int roomNum){
        this.roomNum = roomNum;
        this.isBooked = false;
        this.current_guest = null;
    }

    /**
     *
     * @return if no current guest return null
     */
    @Override
    public Guest getCurrentGuest() {
        return this.current_guest;
    }

    @Override
    public void setCurrentGuest(Guest g) {
        this.current_guest = g;
    }

    /**
     * Get type of room
     */
    @Override
    public Type getRoomType() {
        return this.roomType;
    }

    /**
     * Set new roomType
     *
     * @param t
     */
    @Override
    public void setRoomType(Type t) {
        if(!(t instanceof Type)){
            throw new IllegalArgumentException();
        }
        this.roomType = t;
    }

    @Override
    public boolean isOccupied() {
        return isBooked;
    }

    @Override
    public String toString() {
        return this.roomType + " " + this.roomNum;
    }
}
