package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee;
    @BeforeEach
    void setUp() {
        employee = new Employee("Eyimofe", "Ogunbiyi", 100.00);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setFirstName() {
        employee.setFirstName("Test");
        assertEquals("Test", employee.getFirstName());
    }

    @Test
    void getFirstName() {
        assertEquals("Eyimofe", employee.getFirstName());
    }

    @Test
    void setLastName() {
        employee.setLastName("Test");
        assertEquals("Test", employee.getLastName());
    }

    @Test
    void getLastName() {
        assertEquals("Ogunbiyi", employee.getLastName());
    }

    @Test
    void setMonthlySalary() {
        employee.setMonthlySalary(500.00);
        assertEquals(500.00, employee.getMonthlySalary());
    }

    @Test
    void getMonthlySalary() {
        assertEquals(100.00, employee.getMonthlySalary());
    }
}