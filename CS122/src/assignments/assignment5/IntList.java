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
        IntNode newnode = new IntNode(val,null);

        if (front == null) {
            front = newnode;
        }
        else {
            IntNode temp = front;
            while (temp.next != null)
                temp = temp.next;

            temp.next = newnode;
        }
    }
    //-----------------------------------------
    public void removeFirst()
    {
        if (front != null)
            front = front.next;
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
}
