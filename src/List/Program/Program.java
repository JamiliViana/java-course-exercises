package List.Program;


import List.Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println(" ");

        List<Employee> list = new ArrayList<>();

        for (int i=0; i < n; i++){
            System.out.println("Emplyoee #"+ (i+1) +":");
            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println(" ");

            list.add(new Employee(id,name,salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idToIncreaseSalary = sc.nextInt();
        Integer pos = position(list,idToIncreaseSalary);

        if (pos == null){
            System.out.println("This id does not exist!");
        }else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increase(percent);
        }
        System.out.println(" ");
        System.out.println("List of employees: ");
        for (Employee obj : list) {
            System.out.println(obj);

        }



    }
    public static Integer position(List<Employee> list, int id){
        for (int i =0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
