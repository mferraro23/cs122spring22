package assignments.ExtraQuestions.AnotherTypeOfEmployee;

public class Commission extends Hourly{
    protected double totalSales;
    protected double commission;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double eCommission) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commission = eCommission;
    }

    public void addSales(double eTotalSales){
        totalSales = eTotalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay();
        payment += (commission * totalSales);
        totalSales = 0;
        return payment;
    }
}
