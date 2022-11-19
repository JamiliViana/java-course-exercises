package POO.entities;

import java.util.Scanner;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - this.tax;
    }
    public void increaseSalary(double porcentage){
        double increaseSalary = this.grossSalary + (porcentage * this.grossSalary / 100);
        this.grossSalary = increaseSalary;
    }

    @Override
    public String toString() {
        return name +
                ", $ " +
                String.format("%.2f",netSalary());

    }
}
//  Joao Silva, $ 5000.00
