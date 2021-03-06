package assignments.assignment5.IntNode;
//-----------------------------------------
// Assignment 5 Part One
//-----------------------------------------

public class IntList {
    private IntNode front;

    public IntList(){
        front = null;
    }
    public void addToFront(int val)
    {
        front = new IntNode(val,front);
    }
    //-----------------------------------------
    // Adds given integer to end of list.
    //-----------------------------------------
    public void addToEnd(int val)
    {
        IntNode new_node = new IntNode(val,null);

        if (front == null) {
            front = new_node;
        }
        else {
            IntNode temp = front;
            while (temp.next != null)
                temp = temp.next;

            temp.next = new_node;
        }
    }
    //------------------------------------------------
    // Removes first value from list.
    //------------------------------------------------
    public void removeFirst()
    {
        if (front != null)
            front = front.next;
    }
    //------------------------------------------------
    // Removes last value from list.
    //------------------------------------------------
    public void removeLast(){
        if (front.next==null){
            front = null;
        }

    }
    //------------------------------------------------
    // Overriding toString to print value of the list.
    //------------------------------------------------
    public String toString(){
        StringBuilder sb = new StringBuilder();
        IntNode temp = front;
        while (temp != null)
        {
            sb.append(temp.val);
            temp = temp.next;
        }
        return sb.toString();
    }
    //------------------------------------------------
    // Prints the list elements from first to last.
    //------------------------------------------------
    public void print()
    {
        System.out.println("--------------------");
        System.out.print("List elements: ");
        IntNode temp = front;
        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("\n-----------------------\n");
    }
    //-----------------------------------------
    // Replaces an exact element with a different one
    //-----------------------------------------
    public void replace(int oldValue, int newValue){
        IntNode temp = front;
        while (temp != null) {
            temp.val = temp.val == oldValue ? newValue : temp.val;
            temp = temp.next;
        }
    }
    //-----------------------------------------
    // Returns the length of the list.
    //-----------------------------------------
    public int length(){
        IntNode temp = front;
        int count = 0;
        while (temp != null){
            count += 1;
            temp = temp.next;
        }
        return count;
    }
}
