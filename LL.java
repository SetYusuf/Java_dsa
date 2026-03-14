import java.util.LinkedList;
import java.util.Stack;
public class LL {

/**
 * @param args
 */
public static void main(String[] args){
    // LinkedList = a linear data structure where each element is a separate object
    //              Each element (node) of a list is comprising of two items - the data and a reference to the next node
    //              The last node has a reference to null. The entry point into a linked list is called the head of the list. It should be noted that head is not a separate node, but the reference to the first node. If the list is empty then the head is a null reference.
    //              LinkedList can be used to create stacks, queues, etc.

    //              pros: dynamic size, ease of insertion/deletion
    //              cons: uses more memory than arrays because of storing references, no random access (must access nodes sequentially)
    
LinkedList<String> Linkedlist = new LinkedList<String>();
    Linkedlist.push("A");
    Linkedlist.push("B");
    Linkedlist.push("C");
    Linkedlist.push("D");
    Linkedlist.push("F");
    // Linkedlist.offer("A");
    // Linkedlist.offer("B");
    // Linkedlist.offer("C");
    // Linkedlist.offer("D");
    // Linkedlist.offer("F");

    Linkedlist.add(4,"e");
    Linkedlist.remove("e");
    System.out.println(Linkedlist.peek());
    System.out.println(Linkedlist.peekFirst()); // will get the first element of the linked list
    System.out.println(Linkedlist.peekLast()); // will get the last element of the linked
    System.out.println(Linkedlist.get(2));
    Linkedlist.addFirst("1");
    Linkedlist.addLast("G");
    
// will get the element at index 2
     // will get the element at index 2
    
    // System.out.println(Linkedlist.indexOf("F")); // removes the first element of the linked list
    
    System.out.println(Linkedlist);
 }

}