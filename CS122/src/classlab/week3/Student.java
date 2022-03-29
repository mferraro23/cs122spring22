package classlab.week3;

public class Student extends Person{
    String major;

    public Student(String name, int age, String city, String eMajor){
        super(name, age, city);
        major = eMajor;

    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public int getAge(){
        return age;
    }

    public String getMajor(){
        return major;
    }

    @Override
    void printName() {
        System.out.println(getName());
    }
    void setName(String newName) {
        name = newName;
    }

    static void printObjValues(Object obj){
        Person.printObjValues(obj);
    }


    @Override
    void printAge() {
        System.out.println(getAge());
    }
    void setAge(int newAge){
        age = newAge;
    }

    void printMajor(){
        System.out.println(getMajor());
    }
    void setMajor(String newMajor){
        major = newMajor;
    }


}
