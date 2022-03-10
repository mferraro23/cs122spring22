package assignments.assignment2.Sorting;

public class Superhero implements Comparable<Superhero>{
    private final String fname;
    private final String lname;

    public Superhero(String first, String last){
        fname = first;
        lname = last;
    }

    public String toString(){
        return lname + "," + fname;
    }

    public boolean equals(Object o){
        return (lname.equals(((Superhero) o).getLname()) && fname.equals(((Superhero) o).getFname()));

    }


    public int compareTo(Superhero o) {
        int result;

        if (lname.equals(o.getLname())){
            result = fname.compareTo(o.getFname());
        }
        else{
            result = lname.compareTo(o.getLname());
        }
        return result;
    }

    public String getFname(){
        return fname;
    }

    public String getLname() {
        return lname;
    }
}
