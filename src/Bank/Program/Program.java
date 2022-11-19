package Bank.Program;
import java.util.Scanner;
import java.util.Locale;
import Bank.Account.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        Account ac1 = new Account(number,holder);

        System.out.print("Is there na initial deposit (y/n)? ");
        char haveDeposit = sc.next().charAt(0);

        if (haveDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double value = sc.nextDouble();
            ac1.deposit(value);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(ac1);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double valueDeposit = sc.nextDouble();
        ac1.deposit(valueDeposit);
        System.out.println("Updated account data: ");
        System.out.println(ac1);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double valueWithdraw = sc.nextDouble();
        ac1.withdraw(valueWithdraw);
        System.out.println("Updated account data:");
        System.out.println(ac1);




    }
}
