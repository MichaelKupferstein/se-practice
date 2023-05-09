package edu.yu.cs.com.project.main;

import edu.yu.cs.com.project.people.Guest;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Guest guest;
    private Date checkInDate;
    private Date checkOutDate;
    private int roomNumber;
    private String reservationID;

    public Reservation(Guest guest, Date checkInDate, Date checkOutDate, int roomNumber, String reservationID) {
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomNumber = roomNumber;
        this.reservationID = reservationID;
    }

    public int getLengthOfStay() {
        long diff = this.checkOutDate.getTime() - this.checkInDate.getTime();
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public Guest getGuestName() {
        return this.guest;
    }

    public void setGuestName(Guest guest) {
        this.guest = guest;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

}

