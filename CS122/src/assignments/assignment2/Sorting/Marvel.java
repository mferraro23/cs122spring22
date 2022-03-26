package assignments.assignment2.Sorting;

public class Marvel {

    public static void main(String[] args) {
        Superhero[] heros = new Superhero[5];

        heros[0] = new Superhero("Iron", "Man");
        heros[1] = new Superhero("Thor", "Odinson");
        heros[2] = new Superhero("Bruce", "Banner");
        heros[3] = new Superhero("Natasha", "Romanoff");
        heros[4] = new Superhero("Star", "Lord");

        Reverse_Sorting<Superhero> sorts = new Reverse_Sorting<Superhero>();
        sorts.insertionSort(heros);

        for (Superhero hero: heros){
            System.out.println(hero);
        }
    }
}
