package classlab.week3;

abstract class Person {
    String name;
    String city;
    int age;

    public Person(String eName, int eAge, String eCity) {
        name = eName;
        age = eAge;
        city = eCity;

    }



    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    abstract void printName();

    static void printObjValues(Object obj){
        System.out.println(obj);
    }

    abstract void printAge();


}
