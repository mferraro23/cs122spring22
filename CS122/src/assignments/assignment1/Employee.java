package assignments.assignment1;
// Subclass of Person
public class Employee extends Person{
    String office;
    String salary;
    String dateHired;

    public Employee(String eName, String eAddress, String ePhoneNumber, String eEmailAddress, String eOffice, String eSalary, String eDateHired) {
        super(eName, eAddress, ePhoneNumber, eEmailAddress);
        office = eOffice;
        salary = eSalary;
        dateHired = eDateHired;
    }


    public String toString() {
        String result = "Class: Employee \n";
        result += "Name: " + name + " \n";
        return result;
    }
}
