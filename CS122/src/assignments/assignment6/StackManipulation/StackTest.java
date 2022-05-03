package assignments.assignment6.StackManipulation;

import java.util.Collections;
import java.util.Stack;

public class StackTest {
    static public void printStack(Stack<?> stack) {
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    static public Stack<Integer> reverseStack(Stack<Integer> stack){
        Stack<Integer> newStack = new Stack<Integer>();
        while(!stack.isEmpty()){
            newStack.push(stack.pop());
        }
        return newStack;
    }
    static public Stack<Integer> removeElement(Stack<Integer> stack, int val){
        Stack<Integer> newStack;
        newStack = stack;
        newStack.removeAll(Collections.singleton(val));
        return newStack;
    }
    public static void main(String[] args)
    {
        // Declare and instantiate a stack
        Stack<Integer> stack = new Stack<Integer>();
        //push some stuff on the stack
        for (int i=0; i<10; i++) {
            stack.push(i);
        }
        stack.push(5);
        System.out.println("------------------------");

        // Print Stack
        System.out.println("Stack Printed Normally: ");
        System.out.println("------------------------");
        printStack(stack);
        for (int i=0; i<10; i++) {
            stack.push(i);
        }
        stack.push(5);
        System.out.println("------------------------");

        // Reverse Stack
        System.out.println("Stack Printed Reversed: ");
        System.out.println("------------------------");
        Stack<Integer> reverse = reverseStack(stack);
        printStack(reverse);
        for (int i=0; i<10; i++) {
            stack.push(i);
        }
        stack.push(5);
        System.out.println("------------------------");

        //Remove Element
        //New Stack
        System.out.println("Stack Printed Removing an Element: ");
        System.out.println("------------------------");
        System.out.println("New Stack");
        Stack<Integer> removeStack = removeElement(stack,2);
        printStack(removeStack);
        for (int i=0; i<10; i++) {
            stack.push(i);
        }
        stack.push(5);
        //Old Stack
        System.out.println("------------------------");
        System.out.println("Old Stack:");
        printStack(stack);
        System.out.println("------------------------");
    }
}
