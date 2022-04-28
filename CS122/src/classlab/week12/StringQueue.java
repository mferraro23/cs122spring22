package classlab.week12;

import java.util.LinkedList;

public class StringQueue {
    public static LinkedList<String> str = new LinkedList<String>();
    public static void deQueue() {
        str.removeFirst();
    }

    public static void enQueue(String s) {
        str.addLast(s);
    }

    public static void print(){
        for (String s : str){
            System.out.println("Index: " + s);
        }
    }

    public boolean isEmpty() {
        if(str.size() == 0){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        enQueue("hi");
        enQueue("world");
        //deQueue();
        print();

    }
}
