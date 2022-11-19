package While;

import java.io.IOException;
import java.util.Scanner;

public class Uri1134 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int alcool=0;
        int gasolina =0;
        int diesel = 0;
        int cod = ler.nextInt();

        while (cod != 4){
            if (cod == 1){
                alcool++;
            }else if (cod == 2){
                gasolina++;
            }else if (cod == 3){
                diesel++;
            }
            cod = ler.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }

}