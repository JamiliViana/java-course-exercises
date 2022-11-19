package Lambda.application;


import Lambda.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.println("Enter salary: ");
            Double salaryFilter = sc.nextDouble();

            Comparator<String> comp = (s1 , s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salaryFilter)
                    .map(e -> e.getEmail()).sorted(comp)
                    .collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than "+salaryFilter);
            emails.forEach(System.out::println);

            double sumSalaryStartsM = list.stream().filter(e -> e.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sumSalaryStartsM));

        }catch (Exception e){
            e.getStackTrace();
        }

    }
}
