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
        String result = "Class: Person \n";
        result += "Name: " + name + " \n";
        return result;
    }

}
