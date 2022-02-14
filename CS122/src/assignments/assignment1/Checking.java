package assignments.assignment1;

public class Checking extends Account{
    int overDraftLimit = 20;

    public Checking(int eId, int eBalance) {
        super(eId, eBalance);
        setAnnualInterestRate(1.0);
    }
}
