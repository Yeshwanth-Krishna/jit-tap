package oops;

class Account1 {
    int accountID;
    String holderName;
    double balance;

    // Constructor with validation
    Account1(int accountID, String holderName, double balance) {
        if (accountID >= 100 && accountID <= 999) {
            this.accountID = accountID;
        } else {
            this.accountID = -1;
        }

        this.holderName = holderName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Method to print account balance
    public void setAccountBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
        System.out.println(this.balance);
    }

    // Method to deposit money
    public double credit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println(accountID + holderName + (int)this.balance);
    }
}

class VIPAccount extends Account1 {

    VIPAccount(int accountID, String holderName, double balance) {
        super(accountID, holderName, balance);
    }

    // Overridden method
    @Override
    public void setAccountBalance(double balance) {
        if (balance >= -10000) {
            this.balance = balance;
            System.out.println("The balance can be negative but no less than -10000");
        } else {
            System.out.println("Invalid balance for VIP account");
        }
    }
}

class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int accountID = sc.nextInt();
        String holderName = sc.next();
        double initialBalance = sc.nextDouble();
        double creditAmount = sc.nextDouble();
        double vipBalance = sc.nextDouble();

        VIPAccount vip = new VIPAccount(accountID, holderName, initialBalance);
        vip.displayAccount();

        double newBalance = vip.credit(creditAmount);
        System.out.println((int)newBalance);

        // Call base class method
        ((Account1)vip).setAccountBalance(newBalance);

        // Call overridden method
        vip.setAccountBalance(vipBalance);
    }
}
