package assignments.assignment5.LinkedQueue;

public interface QueueADT {
    //---------------------------------------------
    // Puts item on end of queue.
    //---------------------------------------------
    void enqueue(Object item);
    //---------------------------------------------
    // Removes and returns object from front of queue.
    //---------------------------------------------
    Object dequeue();
    //---------------------------------------------
    // Returns true if queue is empty.
    //---------------------------------------------
    boolean isEmpty();
    //---------------------------------------------
    // Returns true if queue is full.
    //---------------------------------------------
    boolean isFull();
    //---------------------------------------------
    // Returns the number of elements in the queue.
    //--------------------
    int size();
}
