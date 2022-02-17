package classSamples.polymorphism.SearchingAndSorting;

public class Player {
    private final String name;
    private int XP;

    public Player(String eName, int eXP) {
        name = eName;
        XP = eXP;
    }

    public String getName(){
        return name;
    }

    public int getXP(){
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    //equals

    public String toString(){
        return name + " " + XP;
    }
    public int compareTo(Player other) {
        int result = name.compareTo(other.name);
        return result;
    }
}