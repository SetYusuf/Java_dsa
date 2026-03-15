package code;

public class linearS {

    public static void main(String[] args){
                //     0 1 2 3 4 5 6 7 8
        int[] array = {1,2,3,4,5,6,7,8,9};

        int index = linearSearch(array, 1);
        // int index2 = linearSearch(array, 3);
        // int index3 = linearSearch(array, 9);
        // int index4 = linearSearch(array, 6);
        // int index5 = linearSearch(array, 7);
        
;
        if(index != -1){
            System.out.println("element found at index: " + index);
        } else {
            System.out.println("element not found in the array");
        }
    }

    public static int linearSearch(int[] array, int value){

        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }

        return -1;
    }
}