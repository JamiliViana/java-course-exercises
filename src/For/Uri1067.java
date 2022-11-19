package For;
import java.io.IOException;
import java.util.Scanner;


public class Uri1067 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int x = ler.nextInt();
        for (int i=1; i <= x; i++) {
            if ( i % 2 != 0){
                System.out.println(i);
            }
        }
    }

}