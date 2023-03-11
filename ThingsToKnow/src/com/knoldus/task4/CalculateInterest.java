package com.knoldus.task4;
 class BankAccount {
    private static double interestRate = 0.01; // interest rate is set to 1%

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }
}
public class CalculateInterest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        double interestEarned = account.calculateInterest();
        System.out.println("Interest earned: " + interestEarned);

        BankAccount.setInterestRate(0.02); // interest rate is changed to 2%

        interestEarned = account.calculateInterest();
        System.out.println("Interest earned: " + interestEarned);
    }
}
