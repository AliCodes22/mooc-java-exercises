import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of the smallest number:" + indexOfSmallest(array));

    }
    
    public static int smallest(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
             min = array[i];
            }
        }

        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = smallest(array);

       for(int i = 0; i < array.length; i++) {
        if(array[i] == smallest) {
            index = i;
            break;
        }

        
    }
    return index;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex)  {
            int indexOfSmallest = startIndex;
            int smallest = table[startIndex];

            for(int i = startIndex; i < table.length; i++) {
                if(table[i] < smallest) {
                    smallest = table[i];
                    indexOfSmallest = i;
                
                }


            }

            return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];

        array[index1] = array[index2];
        array[index2] = swap;

        System.out.println(Arrays.toString(array));


    }

    public static void sort(int[] array) {

       for (int i = 0; i < array.length; i++) {
        // Find the index of the smallest element in the subarray starting from i
        int smallestIndex = indexOfSmallestFrom(array, i);
        // Swap the current element with the smallest element found
        swap(array, i, smallestIndex);
        // Print the array after each swap to track the sorting process
        System.out.println(Arrays.toString(array));
    }
    }


}
