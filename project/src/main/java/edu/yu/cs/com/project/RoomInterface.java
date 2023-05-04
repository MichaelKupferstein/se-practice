package edu.yu.cs.com.project;

import edu.yu.cs.com.project.people.Guest;

public interface RoomInterface {
    enum Type{
        SINGLE(1),// 1 person
        TWO_BED(2),// 2 people
        SUITE(5), // 2 bedrooms 5 people
        PRESIDENTIAL(7);// 3 bedrooms 7 people
        final int size;
        private Type(int p) {this.size = p;}
    }
    public Guest getCurrentGuest();
    /**
     * Get type of room
     */
    public Type getRoomType();
    /**
     * Set new roomType
     */
    public void setRoomType(Type t);

    public boolean isOccupied();

}
