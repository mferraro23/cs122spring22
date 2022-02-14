package assignments.assignment1;
// Subclass of Person
public class Student extends Person{

    public Student(String eName, String eAddress, String ePhoneNumber, String eEmailAddress, String eClassStatus){
        super(eName, eAddress, ePhoneNumber, eEmailAddress);
        final String classStatus = eClassStatus;


    }
    public String toString(){
        // Display Class Name and the Persons name
        String result = "Class: Student \n";
        result += "Name: " + name + "\n";
        System.out.println(result);
        return result;
    }

}
