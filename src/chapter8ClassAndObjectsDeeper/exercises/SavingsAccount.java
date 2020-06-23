package chapter8ClassAndObjectsDeeper.exercises;

import java.math.BigDecimal;

public class SavingsAccount {
    static private BigDecimal annualInterestRate = BigDecimal.valueOf(0.04);
    private  BigDecimal savingsBalance;

    public BigDecimal calculateMonthlyInterest(){
        BigDecimal amoundForYear = savingsBalance.multiply(annualInterestRate.add(BigDecimal.ONE));
       return amoundForYear;// - savingsBalance;
    }

}

