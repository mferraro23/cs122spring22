package assignments.assignment1;
// Subclass of Employee
public class Faculty extends Employee{
    String officeHours;
    String rank;

    public Faculty(String eName, String eAddress, String ePhoneNumber, String eEmailAddress, String eOffice, String eSalary, String eDateHired, String eOfficeHours, String eRank){
        super(eName, eAddress, ePhoneNumber, eEmailAddress, eOffice, eSalary, eDateHired);
        officeHours = eOfficeHours;
        rank = eRank;
    }

    public String toString() {
        String result = "Class: Faculty \n";
        result += "Name: " + name + " \n";
        return result;
    }

}
