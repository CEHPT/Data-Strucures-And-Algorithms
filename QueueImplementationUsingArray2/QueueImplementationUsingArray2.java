package LogicFirstDSA;

public class QueueImplementationUsingArray2<T> {

    private static final int MAX_SIZE = 30;
    private T[] arr;
    private int  rear;

    QueueImplementationUsingArray2(){

        arr =  (T[]) new Object[MAX_SIZE];
        rear = -1;
    }

    public void enQueue(T val){

        if(rear == MAX_SIZE - 1)
            throw new IndexOutOfBoundsException("Queue Full");

        arr[++rear] = val;
    }

    public T deQueue(){

        if(rear == -1)
            throw new IndexOutOfBoundsException("Queue is empty");

        T temp = arr[0];

        for(int i=1; i<=rear; i++)
            arr[i - 1] = arr[i];

        rear--;

        return temp;
    }
}

/*
 * You can visit queue implementation using array - advantage dequeue is O(1) - disadvantage is More space waste.
 * this type of  queue implementation using array2 - advantage - space is not waste but dequeue time is O(n)
 * */