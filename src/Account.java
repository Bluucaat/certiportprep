import java.util.Date;

public class Account {

    //exploring static methods/variables

    private int id;
    private double balance;
    private static double annualIR = 0; // best to declare static attributes at the start.
    private Date dateCreated;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualIR() {
        return annualIR;
    }

    public static void setAnnualIR(double annualIR) {
        Account.annualIR = annualIR;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public Account() {
        this.balance = 0;
        this.id = 0;
        this.dateCreated = new Date();
    }

    public void withdraw(double m) {
        this.balance = this.balance - m;

    }

    public void deposit(double m) {
        this.balance = this.balance + m;


    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
