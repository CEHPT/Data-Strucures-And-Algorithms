package LogicFirstDSA;

public class StackImplementationUsingLinkedList<T> {

    public class Node{

        private T val;
        private Node next;

        Node(T val){

            this.val = val;
            next = null;
        }
    }

    private Node top;

    StackImplementationUsingLinkedList(){

        top = null;
    }

    public void push(T val){

        Node newNode = new Node(val);

        newNode.next = top;
        top = newNode;
    }

    public T pop(){

        if(top == null)
            throw new NullPointerException("Node not found");

        T result = top.val;
        top = top.next;

        return result;
    }

    public T peek(){

        if(top == null)
            throw new NullPointerException("Node not found");

        return top.val;
    }

    public boolean isEmpty(){

        return top == null;
    }

}
