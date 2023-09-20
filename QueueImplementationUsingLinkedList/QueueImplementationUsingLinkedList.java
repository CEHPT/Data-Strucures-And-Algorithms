package LogicFirstDSA;

public class QueueImplementationUsingLinkedList<T> {

    private Node first , rear;

    class Node{

        private T data;
        private Node next;


        Node(T data){

            this.data = data;
            next = null;
        }
    }

    QueueImplementationUsingLinkedList(){

        first = null;
        rear = null;
    }

    public void enQueue(T data){

        Node newNode = new Node(data);

        if(first == null)
            first = newNode;
        else
            rear.next = newNode;

        rear = newNode;
    }

    public T deQueue(){

        if(first == null)
                throw  new IndexOutOfBoundsException("Queue is Empty");

        T temp = first.data;
        first = first.next;

        if(first == null)
            rear = null;

        return temp;
    }

    public boolean isEmpty(){

        return first == null;
    }

    public T elementAtFront(){

        if(first == null)
            throw  new IndexOutOfBoundsException("Queue is Empty");

        return first.data;
    }
}
