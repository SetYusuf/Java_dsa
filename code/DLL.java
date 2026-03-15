package code;
public class DLL {
    public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.print("Original list: ");
        list.printForward();   // 10 20 30 40

        System.out.print("Backward list: ");
        list.printForward();  // 40 30 20 10

        // Reverse the list
        list.reverse();

        System.out.print("Reversed list: ");
        list.printForward();   // 40 30 20 10
    }
}
}
