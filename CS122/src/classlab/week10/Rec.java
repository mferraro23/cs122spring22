package classlab.week10;


public class Rec {

    public static int fib(int num) {
        int result;
        if (num == 0 || num ==1){
            return num;
        }

        else {
            result = fib(num-1) + fib(num-2);
            return result;

        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println(fib(i));
        }

    }

}
