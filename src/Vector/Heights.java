package Vector;

import java.util.Locale;
import java.util.Scanner;

public class Heights {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];
        int[] nPeoples = new int[n];

        int ageLess16 = 0;
        double sumHeight = 0;

        for(int i= 0; i< n; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            name[i] = sc.nextLine();

            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            if (age[i] < 16){
                ageLess16++;
            }

            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
            sumHeight += height[i];
        }

        double mediaHeight = sumHeight / n;
        System.out.printf("\nAltura media = %.2f\n",mediaHeight);


       double porcentageAgeLess16 = ((double)ageLess16 / n) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",porcentageAgeLess16);

        for(int i=0; i<n; i++) {
            if (age[i] < 16) {
                System.out.printf("%s\n", name[i]);
            }
        }

    }

}
