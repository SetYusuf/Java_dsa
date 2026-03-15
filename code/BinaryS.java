package code;

public class BinaryS {

    public static void main(String[] args) {

        // Create array 0..99
        int array[] = new int[100];
        int target = 42;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Search for value 0
        int index = binarySearch(array, target);

        if(index == -1){
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
            // impletement binary search algorithm

     public static int binarySearch(int[] array, int value) {

        int low = 0;                     // start of array
        int high = array.length - 1;     // end of array
        int steps = 0;                   // count steps

        while (low <= high) {
            steps++;                     // increment step count
            int middle = (low + high) / 2;   // find middle

            System.out.println("Step " + steps + ": middle=" + middle + ", value=" + array[middle]);

            if (array[middle] == value) {
                System.out.println("Found after " + steps + " steps.");  // show steps taken
                return middle;
            }

            if (array[middle] < value) {
                low = middle + 1;        // search right half
            } else {
                high = middle - 1;       // search left half
            }
        }

        System.out.println("Not found after " + steps + " steps.");
        return -1;
    }
}