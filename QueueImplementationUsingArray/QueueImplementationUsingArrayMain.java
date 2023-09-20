package LogicFirstDSA;

public class QueueImplementationUsingArrayMain {

    public static void main(String[] args){

        QueueImplementationUsingArray<Integer> q = new QueueImplementationUsingArray<>();

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
//        System.out.println(q.deQueue());

        System.out.println();

        q.enQueue(23);
        q.enQueue(22);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}
