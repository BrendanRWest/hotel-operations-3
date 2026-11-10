package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    private Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = 0;
        this.bookedSuites = 0;
    }

    private Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite){
        if(roomCount <= 0){
            return false;
        }

        boolean booked = false;
        if(suite){
            if(getAvailableSuites() + roomCount > 0){
                bookedSuites += roomCount;
                booked = true;
                System.out.println("Suite booked successfully.");
            }
        } else {
            if(getAvailableRooms() + roomCount > 0){
                bookedBasicRooms += roomCount;
                booked = true;
                System.out.println("Room booked successfully.");
            }
        }
        return booked;
    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}
