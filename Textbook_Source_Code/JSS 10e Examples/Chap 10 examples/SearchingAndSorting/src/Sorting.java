//********************************************************************
//  Sorting.java       Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************

// Note that <T> refers to a generic type, meaning the class is designed to work with different data types without needing to rewrite the class for each type
// It represents whatever type the Sorting object is created with
// For example, Sorting<Integer> sorter = new Sorting<Integer>(); would have the function public void selectionSort(Comparable<Integer>[] list)
// This allows the use of the compareTo methods that should be defined within each class
public class Sorting<T>
{
    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the selection
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void selectionSort(Comparable<T>[] list)
    {
        int min; // Keeping track of minimum for each pass
        Comparable<T> temp; // temp is needed to properly swap elements

        // Every item of the list is iterated over. This outer loop sets our starting point on each iteration
        for (int index = 0; index < list.length-1; index++)
        {
            min = index; // Our minimum value index for this pass is started on whatever we begin with

            // Starting at our outer loop index + 1, look forward and find the index with the smallest value
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo((T)list[min]) < 0)
                    min = scan;

            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the insertion
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void insertionSort (Comparable<T>[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable<T> key = list[index];
            int position = index;

            //  Shift larger values to the right
            while (position > 0 && key.compareTo((T)list[position-1]) < 0)
            {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }
}
