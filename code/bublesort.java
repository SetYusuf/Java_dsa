package code;

public class bublesort {
    public static void main(String[] args[]) {
        int[] array = {5, 2, 9, 1, 5, 6};

        bubblesort(array);
        
        for(int i : array){
            System.out.println(i);
        }
    }
    /**
     * @param array
     */
    public static void bubblesort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
