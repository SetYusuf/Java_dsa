 
 import java.util.Queue;
 import java.util.LinkedList;
     public class Queues{
        public static void main(String[] args){
          // Queue = FIFO data structure first in first out (ex. a line of people)
         //          A Collection designed for holding elements prior to processinf
         //          is a liner data structure that follows a particular order in which the operations are performed. The order is First In First Out (FIFO). A good example of a queue is any queue of consumers for a resource where the consumer that came first is served first.q
         //          Main operations of a queue are:
         //          Enqueue: add an item to the rear of the queue
         //          Dequeue: remove an item from the front of the queue
         //          Peek: get the value of the front of the queue without removing it       
        //           empty: check if the queue is empty
        //           size: get the number of items in the queue     
        //         add = enqueue, offer()
       //          remove = dequeue, poll()
       Queue<String> queue = new LinkedList<String>();
      // System.out.println(queue.isEmpty()); // true
         queue.offer("Karen");
         queue.offer("Kevin");
         queue.offer("Khalid");
         queue.offer("Yusuf");

         System.out.print(queue.contains("Karen"));
         
         // System.out.println(queue.size());

         // System.out.println(queue.isEmpty()); // false
         // System.out.println(queue.peek()); // will peek the first object not top like stack cuz it FIFO
         // queue.poll(); // will remove the first object not top like stack cuz it FIFO

         System.out.println(queue);

     }
     }