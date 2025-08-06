package oops;

import java.util.Scanner;

class Bank {
    private String Name;
    private double Balance;
    public Bank(String Name,double Balance){
        this.Name=Name;
        this.Balance=Balance;
    }
    public void Deposit(double amount){
        if(Balance>0){
            Balance+=amount;
        }
    }
    public void Withdraw(double amount){
        if(Balance>0&&amount<=Balance){
            Balance-=amount;
        }
    }

    public double getBalance() {
        return Balance;
    }

    public String getName() {
        return Name;
    }
}
class DriveCode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        double Balance=sc.nextDouble();
        Bank b1=new Bank(name,Balance);
        String choice=sc.next();
        double amount=sc.nextDouble();
        if(choice.equals("Deposit")){
            b1.Deposit(amount);
        }
        else{
            b1.Withdraw(amount);
        }
        System.out.println("Name: "+ b1.getName() +" Balance :"+ b1.getBalance());

    }
}

