package classlab.week7;

public class DivisionByZero {

    public static void a(){
        b();

    }

    public static void b(){
        c();
    }

    public static void c(){
        int x = 1;
        int y = 0;
        System.out.println(x/y);
    }
    public static void main(String[] args) {
        a();
        int[] intArray = new int[8];
        System.out.println(intArray[10]);

    }
}
