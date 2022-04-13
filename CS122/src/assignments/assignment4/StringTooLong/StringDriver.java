package assignments.assignment4.StringTooLong;

import java.util.Scanner;

public class StringDriver {
    public static void main(String[] args) throws StringTooLongException {
        Scanner scanner = new Scanner(System.in);
        final int MAX_LENGTH = 20;
        System.out.println("What is your string?");

        try {
            String message = scanner.nextLine();
            if (message.length() > MAX_LENGTH) {
                throw new StringTooLongException();
            }
            else{
                System.out.println(message);
            }
        }
        catch (StringTooLongException e) {
            System.out.print(e.getMessage());
        }
    }
}