package Vector;

import java.util.Locale;
import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos número você vai digitar? ");
        int n = sc.nextInt();
        double[] vector = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
        }
        System.out.print("VALORES = ");
        for(int i = 0; i<n; i++){
            System.out.printf("%.1f ",vector[i]);
        }

        double sum = 0;
        for(int i = 0; i<n; i++){
            sum += vector[i];
        }
        System.out.println("\nSOMA = "+sum);

        double media = sum / n;
        System.out.printf("MÉDIA = %.2f%n",media);

    }
}
