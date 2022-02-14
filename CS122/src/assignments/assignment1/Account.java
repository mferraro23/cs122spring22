package assignments.assignment1;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    double monthlyInterestRate;

    public Account(){
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
    }

    public Account(int eId, double eBalance){
        id = eId;
        balance = eBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Get the monthly Interest Rate.
    public double getMonthlyInterestRate() {
        monthlyInterestRate = annualInterestRate/12.0;
        return monthlyInterestRate;
    }

    // Add Money to the Account.
    public void deposit(double amount){
        balance += amount;
        System.out.println("Account ID: " + id);
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance + "\n-------------");
    }

    public void withdraw(double amount){
        if(balance >= amount) {
            balance -= amount;
        }
        else{
            System.out.println("Balance Not Sufficient");
        }
        System.out.println("Account ID: " + id);
        System.out.println("Withdrew: $" + amount);
        System.out.println("New Balance: $" + balance + "\n-------------");
    }

}
