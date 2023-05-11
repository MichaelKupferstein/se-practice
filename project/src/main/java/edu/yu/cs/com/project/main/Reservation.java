package edu.yu.cs.com.project.main;

import edu.yu.cs.com.project.people.Guest;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Guest guest;
    private Calendar checkInDate;
    private Calendar checkOutDate;
    private int roomNumber;
    private String reservationID;

    public Reservation(Guest guest, Calendar checkInDate, Calendar checkOutDate, int roomNumber, String reservationID) {
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomNumber = roomNumber;
        this.reservationID = reservationID;
    }

    public int getLengthOfStay() {
        long diff = this.checkOutDate.getTimeInMillis() - this.checkInDate.getTimeInMillis();
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public Guest getGuestName() {
        return this.guest;
    }

    public void setGuestName(Guest guest) {
        this.guest = guest;
    }

    public Calendar getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Calendar checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Calendar getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Calendar checkOutDate) {
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

    public boolean overlapsWith(Reservation other) {
        // Check if the check-in date of the other reservation is before the check-out date of this reservation
        if (other.getCheckInDate().before(this.checkOutDate)) {
            // Check if the check-out date of the other reservation is after the check-in date of this reservation
            if (other.getCheckOutDate().after(this.checkInDate)) {
                // The reservations overlap
                return true;
            }
        }
        // The reservations do not overlap
        return false;
    }
}
