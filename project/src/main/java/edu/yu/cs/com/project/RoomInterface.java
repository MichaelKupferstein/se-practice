package edu.yu.cs.com.project;

import edu.yu.cs.com.project.people.Guest;

public interface RoomInterface {
    enum Type{
        TWO_BED,
        SINGLE,
        SUITE,
    }
    public Guest getCurrentGuest();
    /**
     * Get type of room
     */
    public Type getRoomType();

    /**
     * Set new roomType
     */
    public void newRoomType(Type t);

}
