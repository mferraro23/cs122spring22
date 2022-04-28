package assignments.assignment5.LinkedQueue;

import java.util.NoSuchElementException;

public class LinkedQueue implements QueueADT{
    private Node front, back;
    private int numElements;
    //---------------------------------------------
    // Constructor; initializes the front and back pointers
    // and the number of elements.
    //---------------------------------------------
    public LinkedQueue() {
        front = null;
        back = null;
        numElements = 1;
    }
    //---------------------------------------------
    // Puts item on end of queue.
    //---------------------------------------------
    public void enqueue(Object item) {
       Node oldLast = back;
       back = new Node();
       back.setElement(item);
       back.setNext(null);
       if (isEmpty()){
           front = back;
       }
       else{
           numElements++;
           oldLast.setNext(back);
       }
    }
    //---------------------------------------------
    // Removes and returns object from front of queue.
    //---------------------------------------------
    public Object dequeue(){
        Object item = null;
        if (!isEmpty()){
            item = front.getElement();
            front.setElement(front.getNext());
            numElements--;
        }
        return item;
    }
    //---------------------------------------------
    // Returns true if queue is empty.
    //---------------------------------------------
    public boolean isEmpty(){
        return front == null;
    }
    //---------------------------------------------
    // Returns true if queue is full, but it never is.
    //---------------------------------------------
    public boolean isFull(){
        return false;
    }
    //---------------------------------------------
    // Returns the number of elements in the queue.
    //---------------------------------------------
    public int size(){
        return numElements;
    }
    //---------------------------------------------
    // Returns a string containing the elements of the queue
    // from first to last
//---------------------------------------------
    public String toString() {
        StringBuilder result = new StringBuilder("\n");
        Node temp = front;
        while (temp != null)
        {
            result.append(temp.getElement()).append("\n");
            temp = temp.getNext();
        }
        return result.toString();
    }
}
