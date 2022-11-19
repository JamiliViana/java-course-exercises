package While;

import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri1114 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int senha = ler.nextInt();

        while (senha != 2002){
            System.out.println("Senha Invalida");
            senha = ler.nextInt();
        }
        System.out.println("Acesso Permitido");

    }

}