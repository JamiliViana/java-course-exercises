package POO.application;
import POO.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();

        System.out.println("Name: ");
        e1.name = sc.nextLine();

        System.out.println("Gross salary: ");
        e1.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        e1.tax = sc.nextDouble();

        System.out.println("Employee: "+e1);

        System.out.println("Which percentage to increase salary? ");
        double porcentage = sc.nextDouble();
        e1.increaseSalary(porcentage);

        System.out.println("Updated data: "+e1);
    }
}
