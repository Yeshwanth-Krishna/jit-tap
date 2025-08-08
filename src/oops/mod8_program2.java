package oops;

import java.util.Scanner;

class Employee12 {
    double salary;

    Employee12(double salary) {
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee12 {
    Manager(double salary) {
        super(salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
}

class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();
        double salary = sc.nextDouble();

        Employee12 emp;
        if (role.equalsIgnoreCase("Manager")) {
            emp = new Manager(salary);
        } else {
            emp = new Employee12(salary);
        }

        System.out.println("Bonus: " + emp.calculateBonus());
    }
}
