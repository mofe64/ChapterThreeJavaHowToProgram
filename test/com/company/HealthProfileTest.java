package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthProfileTest {
    HealthProfile healthProfile;
    @BeforeEach
    void setUp() {
        healthProfile = new HealthProfile("Eyimofe", "Ogunbiyi", "Male", 1, 27, 1998,74,187);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFirstName() {
        String firstName = healthProfile.getFirstName();
        assertEquals("Eyimofe", firstName);
    }

    @Test
    void setFirstName() {
        healthProfile.setFirstName("test");
        assertEquals("test", healthProfile.getFirstName());
    }

    @Test
    void getLastName() {
        String lastName = healthProfile.getLastName();
        assertEquals("Ogunbiyi", lastName);
    }

    @Test
    void setLastName() {
        healthProfile.setLastName("test");
        assertEquals("test", healthProfile.getLastName());
    }

    @Test
    void getGender() {
        assertEquals("Male", healthProfile.getGender());
    }

    @Test
    void setGender() {
        healthProfile.setGender("Female");
        assertEquals("Female", healthProfile.getGender());
    }

    @Test
    void getMonthOfBirth() {
        assertEquals(1, healthProfile.getMonthOfBirth());
    }

    @Test
    void setMonthOfBirth() {
        healthProfile.setMonthOfBirth(5);
        assertEquals(5, healthProfile.getMonthOfBirth());
    }

    @Test
    void getDayOfBirth() {
        assertEquals(27, healthProfile.getDayOfBirth());
    }

    @Test
    void setDayOfBirth() {
        healthProfile.setDayOfBirth(30);
        assertEquals(30, healthProfile.getDayOfBirth());
    }

    @Test
    void getYearOfBirth() {
        assertEquals(1998, healthProfile.getYearOfBirth());
    }

    @Test
    void setYearOfBirth() {
        healthProfile.setYearOfBirth(2006);
        assertEquals(2006, healthProfile.getYearOfBirth());
    }

    @Test
    void getDateOfBirth() {
        Date date = healthProfile.getDateOfBirth();
        assertEquals(date,healthProfile.getDateOfBirth());
    }

    @Test
    void setDateOfBirth() {
        Date newDate = new Date(9,26,2003);
        healthProfile.setDateOfBirth(newDate);
        assertEquals(newDate, healthProfile.getDateOfBirth());
    }

    @Test
    void getHeightInInches() {
        assertEquals(74, healthProfile.getHeightInInches());
    }

    @Test
    void setHeightInInches() {
        healthProfile.setHeightInInches(100);
        assertEquals(100, healthProfile.getHeightInInches());
    }

    @Test
    void getWeightInPounds() {
        assertEquals(187, healthProfile.getWeightInPounds());
    }

    @Test
    void setWeightInPounds() {
        healthProfile.setWeightInPounds(200);
        assertEquals(200, healthProfile.getWeightInPounds());
    }

    @Test
    void getAge() {
        assertEquals(22, healthProfile.getAge());
    }

    @Test
    void getMaximumHeartRate() {
        assertEquals(198, healthProfile.getMaximumHeartRate());
    }

    @Test
    void getTargetHeartRange() {
        healthProfile.getTargetHeartRange();
    }

    @Test
    void calculateBMI() {
        healthProfile.calculateBMI();
    }
}