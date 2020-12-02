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
    void setFirstName() {
        targetHeartRateCalculator.setFirstName("test");
        assertEquals("test", targetHeartRateCalculator.getFirstName());
    }

    @Test
    void setLastName() {
        targetHeartRateCalculator.setLastName("test");
        assertEquals("test", targetHeartRateCalculator.getLastName());
    }

    @Test
    void setDayOfBirth() {
        targetHeartRateCalculator.setDayOfBirth(5);
        assertEquals(5, targetHeartRateCalculator.getDayOfBirth());
    }

    @Test
    void setMonthOfBirth() {
        targetHeartRateCalculator.setMonthOfBirth(7);
        assertEquals(7, targetHeartRateCalculator.getMonthOfBirth());
    }

    @Test
    void setYearOfBirth() {
        targetHeartRateCalculator.setYearOfBirth(2003);
        assertEquals(2003,targetHeartRateCalculator.getYearOfBirth());
    }

    @Test
    void setDateOfBirth() {
        Date date = new Date(1,1,2000);
        targetHeartRateCalculator.setDateOfBirth(date);
        assertEquals(date,targetHeartRateCalculator.getDateOfBirth());
    }

    @Test
    void getAge() {
        assertEquals(22,targetHeartRateCalculator.getAge());
    }

    @Test
    void getMaxHeartRate() {
        int maxHeartRate  = 220 - targetHeartRateCalculator.getAge();
        assertEquals(maxHeartRate, targetHeartRateCalculator.getMaxHeartRate());
    }

    @Test
    void getTargetHeartRange() {
        targetHeartRateCalculator.getTargetHeartRange();
    }
}