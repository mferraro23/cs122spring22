package assignments.assignment5;

import java.util.Scanner;

public class IntListTest {
    private static Scanner scan;
    private static final IntList list = new IntList();
    //----------------------------------------------------------------
// Creates a list, then repeatedly prints the menu and does what
// the user asks until they quit.
//----------------------------------------------------------------
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    //----------------------------------------
// Does what the menu item calls for.
//----------------------------------------
    public static void dispatch(int choice)
    {
        int newVal;
        String info;
        switch (choice) {
            case 0 -> System.out.println("Bye!");
            case 1 -> { //add to front
                System.out.println("Enter integer to add to front");
                newVal = scan.nextInt();
                list.addToFront(newVal);
            }
            case 2 -> { //add to end
                System.out.println("Enter integer to add to end");
                newVal = scan.nextInt();
                list.addToEnd(newVal);
            }
            case 3 -> {//remove first element
                    list.removeFirst();
            }
            case 4 -> {//remove last element
                list.removeLast();
            }
            case 5 -> {//print
                list.print();
            }
            case 6 -> {//toString
                info = list.toString();
                System.out.println(info);
            }
            case 7 -> {
                int oldValue, newValue;
                System.out.println("Enter the old value: ");
                oldValue = scan.nextInt();
                System.out.println("Enter the new value: ");
                newValue = scan.nextInt();
                list.replace(oldValue, newValue);
            }
            case 8 -> {
                int length = list.length();
                System.out.println("The length of the list is: " + length);
            }
            default -> System.out.println("Sorry, invalid choice");
        }
    }
    //-----------------------------------------
    // Prints the user's choices
    //-----------------------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Add an integer to the front of the list");
        System.out.println("2: Add an integer to the end of the list");
        System.out.println("3: Remove an integer from the front of the list");
        System.out.println("4: Remove an integer from the end of the list");
        System.out.println("5: Print the list");
        System.out.println("6: Returns a String containing the print value of the list.");
        System.out.println("7: Replace all occurrences of a value in the list with a new one.");
        System.out.println("8: Return the length of the list.");
        System.out.print("\nEnter your choice: ");
    }


}
