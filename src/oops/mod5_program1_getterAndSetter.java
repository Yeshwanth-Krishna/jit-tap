package oops;

import java.util.Scanner;

class Employee{
    private String name;
    private float Salary;
    public Employee(String name,float Salary){
        this.name=name;
        this.Salary=Salary;
    }
    public String getName() {
        return name;
    }

    public void setSalary(float newSalary) {
        this.Salary = newSalary;
    }

    public float getSalary() {
        return Salary;
    }
}
class DriversCode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        float cs=sc.nextFloat();
        float ns=sc.nextFloat();
        Employee e1=new Employee(n,cs);
        e1.setSalary(ns);
        System.out.println("Employee name:"+e1.getName()+"Salary"+e1.getSalary());
    }
}
