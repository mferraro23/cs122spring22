package assignments.assignment2.Sorting;

public class Reverse_Sorting {

    // -----------------------------------------------------------------
    // Sorts the specified array of objects using the selection
    // sort algorithm.
    // -----------------------------------------------------------------
    public void selectionSort(Comparable<T>[] list) {
        int min;
        Comparable<T> temp;

        for (int index = list.length-1; index > 0; index--) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo((T) list[min]) < 0)
                    min = scan;

            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    // -----------------------------------------------------------------
    // Sorts the specified array of objects using the insertion
    // sort algorithm.
    // -----------------------------------------------------------------
    public void insertionSort(Comparable<T>[] list) {
        for (int index = list.length; index > 1; index--) {
            Comparable<T> key = list[index];
            int position = index;

            // Shift larger values to the right
            while (position > 0 && key.compareTo((T) list[position - 1]) < 0) {
                list[position] = list[position - 1];
                position--;
            }

            list[position] = key;
        }
    }
}

