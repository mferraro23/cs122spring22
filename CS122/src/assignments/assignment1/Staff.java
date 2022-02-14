package assignments.assignment1;
// Subclass of Employee
public class Staff extends Employee{
    String title;

    public Staff(String eName, String eAddress, String ePhoneNumber, String eEmailAddress, String eOffice, String eSalary, String eDateHired, String eTitle){
        super(eName, eAddress, ePhoneNumber, eEmailAddress, eOffice, eSalary, eDateHired);
        title = eTitle;
    }
    public String toString(){
        // Display Class Name and the Persons name
        String result = "Class: Staff \n";
        result += "Name: " + name + "\n";
        System.out.println(result);
        return result;
    }

}

