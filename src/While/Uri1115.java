package While;

import java.io.IOException;
import java.util.Scanner;

public class Uri1115 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int x, y;
        x = ler.nextInt();
        y = ler.nextInt();

        while (x != 0 && y != 0){

            if(x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
            }else if(x < 0 && y > 0){
                System.out.println("Segundo quadrante");
            }else if(x < 0 && y < 0){
                System.out.println("Terceiro quadrante");
            }else
                System.out.println("Quarto quadrante");

            x = ler.nextInt();
            y = ler.nextInt();
        }

    }

}