package classSamples.polymorphism.SearchingAndSorting;

public class Player implements Comparable<Player> {
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

    public boolean equals(Object o) {
        return this.name.equals(((Player)o).getName());
    }

    public String toString(){
        return this.name + " XP: " + this.XP;
    }
    public int compareTo(Player o) {
        return this.name.compareTo(o.getName()); //string has a compareTo, so we can use that again here and return that
    }
}