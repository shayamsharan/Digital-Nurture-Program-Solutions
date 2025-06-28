package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("Shayam", 1000.0);
    }

    @AfterEach
    void tearDown() {
        account = null;
    }

    @Test
    void testDeposit_AAA() {
        // Arrange
        double depositAmount = 500.0;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    void testWithdraw_AAA() {
        // Arrange
        double withdrawAmount = 200.0;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(800.0, account.getBalance(), 0.001);
    }

    @Test
    void testWithdrawMoreThanBalance_AAA() {
        // Arrange
        double withdrawAmount = 1200.0;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(1000.0, account.getBalance(), 0.001, "Balance should remain unchanged if withdrawal exceeds balance");
    }
}
