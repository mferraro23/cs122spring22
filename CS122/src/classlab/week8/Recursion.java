package classlab.week8;

public class Recursion {
    public static int factorial(int num){
        if (num==1){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }
    }

    public static int numN(int n, int i){
        if (i==1){
            return n;
        }
        else{
            return n+(numN(n, (i-1)));
        }
    }
    public static void main(String[] args) {
        int number = 5;
        int secondNumber = 7;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
        System.out.println("Sum of " + number + " and " + secondNumber +  " is: " + numN(number, secondNumber));
    }
}
