package POO.entities;

public class CurrencyConverter {
    public static double IOF = 0.06;


    public static double dollarToReal( double amount, double price){
        double total = amount * price;
        return total += (total * 0.06);
    }
}
