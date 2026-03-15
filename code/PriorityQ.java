package code;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ{
    public static void main(String[] args)
    {


        // priority queue = A FIFO data structure thatt serves elements
           //               with the highest priority first
        //                  before elements with the priority 
        
        Queue<String> queue = new PriorityQueue<>();
        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());


        queue.offer("b");
        queue.offer("c");
        queue.offer("a");
        queue.offer("d");

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            System.out.println(queue);
            System.out.println(queue.poll());
            
        }                      // auto what is it in vscode
        // priority queue = a data structure that operates similar to a regular queue but where each element has a priority. 
        //                    In a priority queue, an element with high priority is served before an element with low priority. 
        //                    If two elements have the same priority, they are served according to their order in the queue.
        //                    The elements of the priority queue are ordered according to their natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.
        //                    A priority queue does not permit null elements. A priority queue relying on natural ordering also does not permit insertion of non-comparable objects (doing so may result in ClassCastException).
        //                    The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for least value, the head is one of those elements -- ties are broken arbitrarily. The poll() method removes and returns the head of the queue, or returns null if the queue is empty.
        //                    The add() and offer() methods insert an element into the priority queue. The element is added to the end of the list and then "bubbled up" to its proper position based on its priority.
        //                    The remove() and poll() methods remove and return the head of the queue. The element at the head is removed and then "bubbled down" to maintain the heap property.
        //                    The peek() method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

      // [A, C, B] - A has highest priority because it comes first alphabetically
    }
}
