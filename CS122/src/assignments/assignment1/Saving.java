package assignments.assignment1;

public class Saving extends Account{
    int overDraftLimit = 0;
    public Saving(int eId, double eBalance) {
        super(eId, eBalance);
        setAnnualInterestRate(5.0);
    }
}
