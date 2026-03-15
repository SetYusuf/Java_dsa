package code;

public class interpolationS {
    /**
     * @param args
     */
    public static void main(String[] args){
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17};

        int index = interpolationSearch(array, 13);
        
        if (index != -1) {
            System.out.println("element found at index:" + index);
        }
         else {
            System.out.println("Element not found in the array");
         }
           
        }


        
    /**
     * @param array
     * @param value
     * @return
     */
    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0; 
        
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + ((high - low)) *(value - array[low]) / 
            (array[high] - array[low]);

            System.out.println("Probe index: " + probe);
            
            if(array[probe] == value){
                return probe;
            }
            else if(array[probe] < value){
                low = probe + 1;
            }
            else{
                high = probe - 1;
            }
            }
        return -1; // Element not found
    }
}