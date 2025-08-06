package oops.Inheritance;

import java.util.Scanner;

class Employee{
   Integer Empid;
   Float Salary;
   Employee(Integer Empid,Float Salary){
       this.Empid=Empid;
       this.Salary=Salary;
   }
}
class empLevel extends Employee{
    Integer Level;
    empLevel(Integer Empid,Float Salary){
        super(Empid,Salary);
        this.Level=(Salary>1000)? 1:2;
    }
    void Display(){
        System.out.println(Empid);
        System.out.println(Salary);
        System.out.println(Level);
    }
}
class DriverCode1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empId= sc.nextInt();
        float salary= sc.nextFloat();
        empLevel e1=new empLevel(empId,salary);
        e1.Display();
    }
}