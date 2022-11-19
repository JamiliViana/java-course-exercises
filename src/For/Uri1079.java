package For;
import java.util.Scanner;
import java.io.IOException;

public class Uri1079 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n, x, in, out;
        n = ler.nextInt();

        in = 0;
        out = 0;
        for (int i = 0 ; i < n ; i++){
            x = ler.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}
