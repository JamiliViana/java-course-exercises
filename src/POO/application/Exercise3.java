package POO.application;
import POO.entities.Student;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        s1.name = sc.nextLine();
        s1.grade1 = sc.nextDouble();
        s1.grade2 = sc.nextDouble();
        s1.grade3 = sc.nextDouble();

        s1.finalGrade();
        s1.passOrNot();
    }
}
