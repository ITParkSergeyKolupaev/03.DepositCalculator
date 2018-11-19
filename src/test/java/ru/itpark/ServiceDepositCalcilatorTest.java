package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceDepositCalcilatorTest {

    @Test
    void calculateDeposit() {
        {
            ServiceDepositCalculator serviceDepositCalculator = new ServiceDepositCalculator();
            int calculateDeposit = serviceDepositCalculator.calculateDeposit(700, 12, 8);
            assertEquals(756, calculateDeposit);
        }
        {
            ServiceDepositCalculator serviceDepositCalculator = new ServiceDepositCalculator();
            int calculateDeposit = serviceDepositCalculator.calculateDeposit(700_000, 36, 8);
            assertEquals(868_000, calculateDeposit);
        }
    }
}