package LogicFirstDSA;

public class QueueImplementationUsingArray<T> {

    private static final int MAX_SIZE = 30;
    private T[] arr;
    private int first , rear;

    QueueImplementationUsingArray(){

        arr =  (T[]) new Object[MAX_SIZE];
        first = 0;
        rear = -1;
    }

    public void enQueue(T val){

        if(rear == MAX_SIZE - 1)
            throw new IndexOutOfBoundsException("Queue Full");

        arr[++rear] = val;
    }

    public T deQueue(){

        if(rear == -1 || first > rear)
            throw new IndexOutOfBoundsException("Queue Is Empty");

        return arr[first++];
    }
}

/*
* This type of queue implementation using array - advantage dequeue is O(1) - disadvantage is More space waste.
* You can visit queue implementation using array2 - advantage - space is not waste but dequeue time is O(n)
* */