package assignments.assignment5.IntNode;
//-----------------------------------------
// Assignment 5 Part One
//-----------------------------------------

public class IntNode {
    public int val; //value stored in node
    public IntNode next; //link to next node in list
    //------------------------------------------------------------------
    // Constructor; sets up the node given a value and IntNode reference
    //------------------------------------------------------------------
    public IntNode(int val, IntNode next)
    {
        this.val = val;
        this.next = next;
    }
}
