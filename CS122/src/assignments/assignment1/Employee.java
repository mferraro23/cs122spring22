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


    public String toString(){
        // Display Class Name and the Persons name
        String result = "Class: Employee \n";
        result += "Name: " + name + "\n";
        System.out.println(result);
        return result;
    }
}
