package LogicFirstDSA;

public class DoublyLinkedListMain {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.insertAtBeginning(10);
        dll.insertAtBeginning(12);
        dll.insertAtBeginning(13);
        dll.insertAtBeginning(15);
        dll.insertAtBeginning(14);

        dll.display();
        dll.displayRev();

        dll.insertAtPosition(2,102);
        dll.display();
        dll.displayRev();

        dll.deleteAtPosition(5);
        dll.display();
        dll.displayRev();

        System.out.println();

        System.out.println(dll.get(2));
        dll.update(1,23);
        dll.deleteAtEnd();

        dll.display();
        dll.displayRev();

        dll.insertAtEnd(10);
        dll.displayRev();
        dll.display();

        System.out.println(dll.length());

        dll = null;
    }
}
