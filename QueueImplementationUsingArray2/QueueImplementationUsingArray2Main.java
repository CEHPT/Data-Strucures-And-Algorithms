package LogicFirstDSA;

public class QueueImplementationUsingArray2Main {

    public static void main(String[] args){

        QueueImplementationUsingArray2<Integer> q = new QueueImplementationUsingArray2<>();

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

        q = null;

    }
}
