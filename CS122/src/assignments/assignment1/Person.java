package assignments.assignment1;

public class Person {
    String name;
    String address;
    String phoneNumber;
    String emailAddress;

    public  Person(String eName, String eAddress, String ePhoneNumber, String eEmailAddress) {
        name = eName;
        address = eAddress;
        phoneNumber = ePhoneNumber;
        emailAddress = eEmailAddress;
    }

    public String toString(){
        // Display Class Name and the Persons name
        String result = "Class: Person \n";
        result += "Name: " + name + "\n";
        System.out.println(result);
        return result;
    }
}
