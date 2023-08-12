package LogicFirstDSA;

import java.util.Iterator;

public class LinkedListMain {

    public static void main(String args[]) {

        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.insertAtBeginning(10);
        ll.insertAtBeginning(20);
        ll.insertAtBeginning(30);

        ll.display();

        ll.insertAtPosition(1,25);
        ll.insertAtPosition(0,40);
        ll.insertAtPosition(5,5);
        //ll.insertAtPosition(-1,100);

        ll.display();

        ll.deleteAtPosition(0);
        ll.display();

        System.out.println(ll.get(2));
        ll.update(1,20);
        ll.display();
        ll.deleteAtEnd();
        ll.display();
        ll.insertAtEnd(1);
        ll.display();
        System.out.println(ll.search(1));
        System.out.println(ll.contain(1));
        System.out.println(ll.length());

//        for(int n : ll)
//            System.out.println(n);
//        or
//       Iterator<Integer> it = ll.iterator();
//
//        while(it.hasNext())
//            System.out.print(it.next() + " ");


        ll = null;
    }
}
