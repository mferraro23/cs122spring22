package classSamples.polymorphism.SearchingAndSorting;


public class Avengers {
    public static void main(String[] args) {
        Player[] avengers = new Player[4];
        avengers[0] = new Player("Loki",100);
        avengers[1] = new Player("Spider-man",99);
        avengers[2] = new Player("Wanda",150);
        avengers[3] = new Player("Dr. Strange",125);
        Sorting<Player> sorts = new Sorting<>();
        sorts.insertionSort(avengers);
        for (Player avenger: avengers){
            System.out.println(avenger);
        }
    }
}
