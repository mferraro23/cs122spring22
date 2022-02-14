package assignments.assignment1;

public class AccountDriver {
    public static void main(String[] args) {
        Checking myCheckingAccount = new Checking(543221, 5000);
        Saving mySavingAccount = new Saving(442355,25000);

        System.out.format("Account #" + myCheckingAccount.getId() + "\nMonthly Interest Rate: " + "%.3f" + "\nAnnual Interest Rate: " + "%.3f\n", myCheckingAccount.getMonthlyInterestRate(), myCheckingAccount.getAnnualInterestRate());
        System.out.println("-----------------");
        System.out.format("Account #" + mySavingAccount.getId() + "\nMonthly Interest Rate: " + "%.3f" + "\nAnnual Interest Rate: " + "%.3f\n", mySavingAccount.getMonthlyInterestRate(), mySavingAccount.getAnnualInterestRate());
        System.out.println("-----------------");
        myCheckingAccount.withdraw(300);
        mySavingAccount.deposit(5000);
    }
}
