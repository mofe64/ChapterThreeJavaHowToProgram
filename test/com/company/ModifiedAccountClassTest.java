package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedAccountClassTest {
    ModifiedAccountClass account;
    @BeforeEach
    void setUp() {
        account = new ModifiedAccountClass(100.00, "Eyimofe");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void deposit() {
        account.deposit(100);
        assertEquals(200.00, account.getBalance());
    }
    @Test
    void cannotDepositNegativeValues(){
        account.deposit(-100);
        assertEquals(100.00, account.getBalance());
    }

    @Test
    void getBalance() {
        assertEquals(100.00,account.getBalance());
    }

    @Test
    void setName() {
        account.setName("test");
        assertEquals("test", account.getName());
    }

    @Test
    void getName() {
        assertEquals("Eyimofe", account.getName());
    }

    @Test
    void withdraw() {
        account.withdraw(50.00);
        assertEquals(50.00, account.getBalance());
    }

    @Test
    void testCantWithdrawMoreThanItemInAccountBalance(){
        account.withdraw(600.00);
        assertEquals(100.00,account.getBalance());
    }
}