package oops;

import java.util.Scanner;

class Bank2 {

    // Method 1: Accepts account type as String
    public double getInterestRate(String accountType, double amount) {
        switch (accountType) {
            case "Savings":
                return amount * 0.04;
            case "FixedDeposit":
                return amount * 0.06;
            case "RecurringDeposit":
                return amount * 0.05;
            default:
                return 0;
        }
    }

    // Method 2: Accepts account type as int code
    // 1 = Savings, 2 = FixedDeposit, 3 = RecurringDeposit
    public double getInterestRate(int accountCode, double amount) {
        switch (accountCode) {
            case 1:
                return amount * 0.04;
            case 2:
                return amount * 0.06;
            case 3:
                return amount * 0.05;
            default:
                return 0;
        }
    }

    // Method 3: Accepts two double values
    // First is fixed rate (e.g., 0.04), second is amount
    public double getInterestRate(double rate, double amount) {
        return rate * amount;
    }
}

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountType = sc.next();
        double amount = sc.nextDouble();

        Bank2 bank = new Bank2();
        double interest = bank.getInterestRate(accountType, amount);

        System.out.println("Interest: " + interest);
    }
}
