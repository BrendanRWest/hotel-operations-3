package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchIn_EmployeeHoursAreCalculatedProperly_True(){
        // Arrange
        Employee johnny = new Employee(31, "Johnny",
                "Sales", 17.50);

        // Act
        johnny.punchIn(9);
        johnny.punchOut(17);
        double hours = johnny.getRegularHours();

        // Assert
        assertEquals((17-9), hours);


    }

}