package LogicFirstDSA;

public class CircularLinkedListMain {

    public static void main(String[] args){

        CircularLinkedList<String> cll = new CircularLinkedList<>();

        cll.insertAtBeginning("Ramu");
        cll.insertAtBeginning("Somu");
        cll.insertAtBeginning("Kumar");
        cll.insertAtBeginning("Karthi");
        cll.insertAtBeginning("Murthi");

        cll.display();

//        cll.deleteAtBeginning();
//        cll.display();
//
//        cll.deleteAtEnd();
//        cll.display();
//
//        cll.deleteAtEnd();
//        cll.display();
//
//        cll.deleteAtEnd();
//        cll.display();
//
////        cll.deleteAtEnd();
//        cll.display();

//        cll.deleteVal("somu");
//        cll.display();

        cll.deleteVal("Somu");
        cll.display();

        System.out.println(cll.contain("Da suresh"));

        System.out.println(cll.size());

        cll = null;
    }
}
