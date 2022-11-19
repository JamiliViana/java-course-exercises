package OOP.application;
import java.util.Locale;
import java.util.Scanner;
import OOP.entities.CurrencyConverter;

public class DollarConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the dollar price? ");
        double price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double tot = CurrencyConverter.dollarToReal(amount,price);

        System.out.printf("Amount to be paid in reais = %.2f%n",tot);

    }


}
