package assignments.assignment1;
// Driver
public class UniversityDriver {
    public static void main(String[] args) {
        Person person1 = new Person("Olive Yew", "28 Brick Lane", "(914)555-6677", "oliveyew2@gmail.com");
        person1.toString();
        Student student1 = new Student("Aida Bugg", "44 New Street", "(908)302-5533","aida33@gmail.com","freshman");
        student1.toString();
        Employee employee1 = new Employee("John Mark", "8 Main Street", "(914)432-6611", "jmark44@gmail.com", "E322", "$78,000", "07/15/2015");
        employee1.toString();
        Faculty faculty1 = new Faculty("Roger Willis", "10 Main Street", "(914)232-4900", "rogwilly66@gmail.com", "W510", "$158,000","10/23/2011", "MWF - 2:00PM","Head of English");
        faculty1.toString();
        Staff staff1 = new Staff("Chloe Franklin", "3 Kendrive Court", "(908)300-1155","cfranklin73@gmail.com","W122","$115,000", "02/25/2001", "Professor");
        staff1.toString();

    }
}


