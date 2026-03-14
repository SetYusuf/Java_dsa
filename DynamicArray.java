// Define a class called DynamicArray
public class DynamicArray {

    // Internal array to store elements
    private Object[] array;  // Example: [1, 2, 3, _] initially empty slots are null

    // Number of elements currently in the array
    private int size;        // Example: size = 3 if array has 3 elements

    // Maximum number of elements the array can hold before resizing
    private int capacity;    // Example: capacity = 10 initially

    // =========================
    // Default constructor
    // =========================
    public DynamicArray() {
        this.capacity = 10;              // Initial capacity is 10
        this.array = new Object[capacity]; // Create an array of size 10
        this.size = 0;                    // No elements added yet
        // Example after constructor: array = [null,null,...], size=0, capacity=10
    }

    // =========================
    // Constructor with custom initial capacity
    // =========================
    public DynamicArray(int capacity) {
        this.capacity = capacity;           // Set initial capacity to given value
        this.array = new Object[capacity];  // Create array with given capacity
        this.size = 0;                      // No elements yet
        // Example: new DynamicArray(5) → array = [null,null,null,null,null], size=0, capacity=5
    }

    // =========================
    // Add an element to the dynamic array
    // =========================
    public void add(Object value) {
        // If the array is full, resize it
        if (size == capacity) {
            capacity *= 2;                    // Double the capacity
            Object[] newArray = new Object[capacity]; // Create new bigger array

            // Copy old elements to the new array
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }

            array = newArray;                 // Replace old array with new array
            // Example: array was [1,2,3,4], size=4, capacity=4 → now new array = [1,2,3,4,null,null,null,null], capacity=8
        }

        // Add the new element to the array
        array[size++] = value;                // Place value at index=size, then increase size
        // Example: add(5) → array = [1,2,3,4,5,...], size=5
    }

    // =========================
    // Get element at a specific index
    // =========================
    public Object get(int index) {
        if (index < 0 || index >= size) {     // Check if index is valid
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return array[index];                  // Return element at that index
        // Example: get(2) → returns 3
    }

    // =========================
    // Get current number of elements
    // =========================
    public int size() {
        return size;                         // Example: size() → 5
    }

    // =========================
    // Get current capacity of the array
    // =========================
    public int capacity() {
        return capacity;                     // Example: capacity() → 8
    }

    // =========================
    // Print all elements in the array
    // =========================
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " "); // Print elements separated by space
        }
        System.out.println();                 // Move to next line
        // Example: array = [1,2,3] → prints "1 2 3"
    }

    // =========================
    // Main method for testing
    // =========================
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray(2); // Initial capacity 2
        da.add(1);                              // Add 1 → array=[1,_], size=1
        da.add(2);                              // Add 2 → array=[1,2], size=2
        da.add(3);                              // Add 3 → triggers resize → array=[1,2,3,_], size=3, capacity=4
        da.add(4);                              // Add 4 → array=[1,2,3,4], size=4

        da.print();                             // Prints: 1 2 3 4
        System.out.println("Size: " + da.size());       // Prints: Size: 4
        System.out.println("Capacity: " + da.capacity()); // Prints: Capacity: 4 → after resize, may double again if more added
    }
}