package classlab.week3;

public class StudentDriver {
    public static void main(String[] args) {
        Student csStudent = new Student("Michael", 21, "Yorktown Heights", "Computer Science");
        csStudent.printName();
        csStudent.printAge();
        csStudent.printMajor();
    }
}
