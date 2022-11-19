package Bank.Account;

public class Account {
    private double balance;
    private int numberAccount;
    private String nameHolder;
    private static double TAX_WITHDRAW = 5.00;

    public Account(int numberAccount, String nameHolder) {
        this.numberAccount = numberAccount;
        this.nameHolder = nameHolder;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public double deposit(double value){
        return this.balance += value;
    }

    public double withdraw (double value){
        return this.balance -= (value + TAX_WITHDRAW);
    }

    @Override
    public String toString() {
        return "Account " +
                numberAccount +
                ", Holder: " +
                nameHolder +
                ", Balance: $ " +
                String.format("%.2f",balance);
    }
}
