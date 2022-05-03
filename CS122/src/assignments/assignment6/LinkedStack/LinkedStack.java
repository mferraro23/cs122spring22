package assignments.assignment6.LinkedStack;


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
        if (top.getElement() == null){
            top.setElement(val);
        }
        else {
            top.setNext(newNode);
        }
    }
    // ---------------------------------------------------
    // Removes and returns value at top of stack. If stack
    // is empty returns null.
    // ---------------------------------------------------
    @Override
    public Object pop() {
        Object item;
        if(!isEmpty()) {
            item = top.getElement();
            top.setElement(top.getNext().getElement());
            return item;
        }
        else{
            return null;
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
