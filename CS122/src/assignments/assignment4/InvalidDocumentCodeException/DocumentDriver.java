package assignments.assignment4.InvalidDocumentCodeException;

import java.util.Scanner;

public class DocumentDriver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the designation: ");

        String designation = scan.next();

        try {

            if (designation != null && (designation.charAt(0) == 'U' || designation.charAt(0) == 'C' || designation.charAt(0) == 'P') && designation.length() == 2) {

                System.out.println("Valid designation");

            } else {

                throw new InvalidDocumentCodeException("Invalid designation. Designation must be two characters and start with U, C or P.");

            }

        } catch (InvalidDocumentCodeException e) {

            System.out.println(e);

        }
    }
}
