package assignments.assignment6.LinkedStack;

import static java.lang.System.exit;

public class LinkedStack implements StackADT {
    private Node top; // reference to top of stack
    // ---------------------------------------------------
    // Constructor -- initializes top
    // ---------------------------------------------------
    public LinkedStack(){
        top = new Node();
    }
    // ---------------------------------------------------
    // Adds element to top of stack if it's not full, else
    // does nothing.
    // ---------------------------------------------------
    @Override
    public void push(Object val) {
        Node newNode = new Node(val);
        if (isEmpty()){
            newNode.setNext(null);
        }
        else{
            newNode.setNext(top);
            top = newNode;
        }
    }
    // ---------------------------------------------------
    // Removes and returns value at top of stack. If stack
    // is empty returns null.
    // ---------------------------------------------------
    @Override
    public Object pop() {
        if (!isEmpty()){
            Object node = top.getElement();
            top = top.getNext();
            return node;
        }
        else{
            return 0;
        }
    }
    // ---------------------------------------------------
    // Returns true if stack is empty, false otherwise.
    // ---------------------------------------------------
    @Override
    public boolean isEmpty() {
        return top == null;
    }
    // ---------------------------------------------------
    // Returns true if stack is full, false otherwise.
    // ---------------------------------------------------
    @Override
    public boolean isFull() {
        return false;
    }
}