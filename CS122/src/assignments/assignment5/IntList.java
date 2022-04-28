package assignments.assignment5;


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
        //System.out.println("info: " + sb);
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
        boolean running = true;
        IntNode temp = front;
        while (temp != null){
            if (front.val == oldValue) {
                front.val = newValue;
                replace(oldValue, newValue);
                System.out.println("hit");
            }
            temp = temp.next;
        }

    }
}
