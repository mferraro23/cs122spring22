package assignments.assignment6.StackManipulation;

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
        Stack<Integer> newStack = new Stack<Integer>();
        while(!stack.isEmpty()){
            int temp = stack.elements().nextElement();
            if (temp == val){
                stack.pop();
                newStack.push(temp);
            }
            else{
                newStack.push(temp);
            }
        }
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
        //stack.push(5);
        //printStack(stack);
        //Stack<Integer> reverse = reverseStack(stack);
        //printStack(reverse);
        Stack<Integer> newStack = removeElement(stack,2);
        System.out.println("New Stack:");
        printStack(newStack);
        System.out.println("Old Stack:");
        printStack(stack);
        //comment out ones at a time otherwise nothing gets printed after the first due to pop method.
    }
}
