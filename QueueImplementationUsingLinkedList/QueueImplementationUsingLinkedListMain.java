package LogicFirstDSA;

public class QueueImplementationUsingLinkedListMain {

    public static void main(String[] args){

        QueueImplementationUsingLinkedList<Integer> q= new QueueImplementationUsingLinkedList<>();

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(10);
        q.enQueue(30);
        q.enQueue(40);


        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
//        System.out.println(q.deQueue());


        q = null;
    }
}
