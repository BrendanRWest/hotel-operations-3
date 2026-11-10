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


        bookedBasicRooms = 0;
        bookedSuites = 0;
    }

    private Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite){
        boolean booked = false;
        if(suite){
            if(getAvailableSuites()>0){
                bookedSuites += 1;
                numberOfSuites -= 1;
                booked = true;
                System.out.println("Suite booked successfully.");
            }
        } else {
            if(getAvailableRooms()>0){
                bookedBasicRooms += 1;
                numberOfRooms -= 1;
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
}
