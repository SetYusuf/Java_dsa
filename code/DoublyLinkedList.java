package code;
// #NOTE NOTE  

    // every thing that change in DoublyLinkedList.java file  
    // Will effect that way we use DoublyLinkedList later 
    // in the folder 
    
public class DoublyLinkedList {

    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    public void add(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void printForward(){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public void reverse(){

        Node current = head;
        Node temp = null;

        while(current != null){

            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if(temp != null){
            head = temp.prev;
        }
    }
}