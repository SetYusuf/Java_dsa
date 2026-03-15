package code;

public class selectionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        selectionSort(array);
        
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] array){
        int n = array.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
}
