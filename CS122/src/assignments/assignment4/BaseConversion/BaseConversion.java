package assignments.assignment4.BaseConversion;

import java.util.Scanner;

public class BaseConversion {
    public static int base10;
    public static int base;
    public static int quotient = 0;
    public static int remainder = 0;
    public static String num = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Base 10 number to convert: ");
        base10 = scanner.nextInt();
        System.out.println("Enter the base to convert to: ");
        base = scanner.nextInt();

        convert(base10, base);

    }
    public static void convert(int b1, int b2) {
        base10 = b1;
        base = b2;

        if ((base10 / base) != 0) {
            quotient = base10 / base;
            remainder = base10 % base;
            num += remainder;
            convert(quotient, base);
        }
        else {
            remainder = base10 % base;
            num += remainder;
            System.out.println(new StringBuilder(num).reverse());
        }
    }
}
