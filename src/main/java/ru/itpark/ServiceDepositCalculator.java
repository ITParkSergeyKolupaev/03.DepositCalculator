package ru.itpark;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ServiceDepositCalculator {
    public int calculateDeposit(int depositAmount, int termDeposit, int interestRate) {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = LocalDate.now().plusMonths(termDeposit);
        int daysElapsed = (int) ChronoUnit.DAYS.between ( currentDate , futureDate );
        int percent = 100;
        int numberDaysInYear = 365;
        int interestPeriodInYear = daysElapsed / numberDaysInYear;

        int amountInterestAccrued = depositAmount + (depositAmount * interestRate *interestPeriodInYear) / percent;
        return amountInterestAccrued;
    }
}
