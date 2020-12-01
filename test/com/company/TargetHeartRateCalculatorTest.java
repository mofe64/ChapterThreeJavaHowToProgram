package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateCalculatorTest {
    TargetHeartRateCalculator targetHeartRateCalculator;
    @BeforeEach
    void setUp() {
        targetHeartRateCalculator = new TargetHeartRateCalculator("Eyimofe", "Ogunbiyi", 27,1,1998);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFirstName() {
        assertEquals("Eyimofe", targetHeartRateCalculator.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Ogunbiyi", targetHeartRateCalculator.getLastName());
    }

    @Test
    void getDayOfBirth() {
        assertEquals(27, targetHeartRateCalculator.getDayOfBirth());
    }

    @Test
    void getMonthOfBirth() {
        assertEquals(1, targetHeartRateCalculator.getMonthOfBirth());
    }

    @Test
    void getYearOfBirth() {
        assertEquals(1998,targetHeartRateCalculator.getYearOfBirth());
    }

    @Test
    void getDateOfBirth() {

    }

    @Test
    void setFirstName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void setDayOfBirth() {
    }

    @Test
    void setMonthOfBirth() {
    }

    @Test
    void setYearOfBirth() {
    }

    @Test
    void setDateOfBirth() {
    }

    @Test
    void getAge() {
    }

    @Test
    void getMaxHeartRate() {
    }

    @Test
    void getTargetHeartRange() {
    }
}