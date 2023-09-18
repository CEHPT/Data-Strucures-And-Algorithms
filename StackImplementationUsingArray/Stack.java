package LogicFirstDSA;

public class Stack<T> {

    private static final int MAX_SIZE = 30;
    private T arr[] = (T[]) new Object[MAX_SIZE];
    private int top;

    Stack(){
        top = -1;
    }

    public void push(T val){

        if(top == MAX_SIZE - 1)
            throw new IndexOutOfBoundsException("Stack Overflow");

        arr[++top] = val;
    }

    public T pop(){

        if(top == -1)
            throw new IndexOutOfBoundsException("Stack Underflow");

        return arr[top--];
    }

    public T peek(){

        if(top == -1)
            throw new IndexOutOfBoundsException("No data found");

        return arr[top];
    }

    public boolean isEmpty(){

        return top == -1;
    }

    public int size(){

        return top + 1;
    }

    public int getTop(){

        return top;
    }
}
