package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_AvailableRoomCanBeCheckedInto_True(){
        // Arrange
        Room room1 = new Room(2, 139.00);

        // Act
        room1.checkIn();
        boolean occupied = room1.isOccupied();

        // Assert
        assertTrue(occupied);
    }

    @Test
    public void checkIn_OccupiedRoomCanBeCheckedInto_False(){
        // Arrange
        Room room2 = new Room(2, 139.00);

        // Act
        room2.checkIn();
        boolean available = room2.isAvailable();

        // Assert
        assertFalse(available);
    }

    @Test
    public void cleanRoom_UnoccupiedRoomCanBeCleaned_True(){
        // Arrange
        Room room3 = new Room(2, 139.00);

        // Act
        room3.checkIn();
        room3.checkOut();
        room3.cleanRoom();

        boolean clean = !room3.isDirty();

        // Assert
        assertTrue(clean);
    }

    @Test
    public void checkOut_CheckedOutRoomIsOccupied_False(){
        // Arrange
        Room room4 = new Room(2, 139.00);

        // Act
        room4.checkIn();
        room4.checkOut();

        boolean checkOccupied = room4.isOccupied();

        // Assert
        assertFalse(checkOccupied);
    }
}