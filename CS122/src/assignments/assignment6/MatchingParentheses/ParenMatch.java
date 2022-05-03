package assignments.assignment6.MatchingParentheses;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class ParenMatch {
    static int leftCount = 0;
    static int rightCount = 0;
    public static int count(Stack<String> s){
        int equals;
        while(!s.isEmpty()){
            if (Objects.equals(s.pop(), "(")){
                leftCount += 1;
            }
            else{
                rightCount += 1;
            }
        }
        if (leftCount == rightCount){
            equals = 0;
        }
        else if (leftCount>rightCount){
            equals = 1;
        }
        else{
            equals = 2;
        }

        return equals;
    }
    public static void compareString(Stack<String> s) {
        if(s.size()%2==0){
            if(count(s) == 0) {
                System.out.println("It Contains Equal Left and Right Parenthesis.");
            }
            else if(count(s) == 1 || count(s) == 2){
                System.out.println("It Does NOT Contains Equal Left and Right Parenthesis.");
                if (leftCount>rightCount){
                    System.out.println("There were not enough right Parenthesis.");
                }
                else{
                    System.out.println("There were not enough right Parenthesis.");
                }
            }
        }
        else{
            System.out.println("It Does Not Contain Equal Left and Right Parenthesis.\nError Occurred Here:");
            if(count(s) == 1){
                System.out.println("There were not enough right Parenthesis.");
            }
            else{
                System.out.println("There were not enough right Parenthesis.");
            }
        }
    }
    public static void main (String[] args)
    {
        Stack<String> s = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.println ("\nParenthesis Matching");
        System.out.print ("Enter a parenthesized expression: ");
        String line = scan.nextLine();
        // loop to process the line one character at a time
        for (int i = 0; i < line.length(); i++){
            if (line.charAt(i) == '(' || line.charAt(i) == ')'){
                s.push(String.valueOf(line.charAt(i)));
            }
        }
        compareString(s); //Print Results
    }
}
