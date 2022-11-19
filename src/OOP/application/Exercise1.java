package OOP.application;
import OOP.entities.Rectangle;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        r1.width = sc.nextDouble();
        r1.height = sc.nextDouble();

        System.out.println(r1);

    }
}
