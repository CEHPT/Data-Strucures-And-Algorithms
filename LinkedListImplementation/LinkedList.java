package LogicFirstDSA;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    class Node {

        private T data;
        private Node next;

        public Node(T value) {

            data = value;
            next = null;
        }
    }

    private Node head;

    LinkedList() {

        head = null;
    }

    public void insertAtBeginning(T value) {

        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;
    }

    public void display() {

        Node tempHead = head;

        while (tempHead != null) {

            System.out.print(tempHead.data + " ");
            tempHead = tempHead.next;
        }

        System.out.println();
    }

    public Iterator<T> iterator() {

        return new Iterator<T>() {

            Node tempHead = head;

            @Override
            public boolean hasNext() {

                return tempHead != null;
            }

            @Override
            public T next() {

                T result = tempHead.data;
                tempHead = tempHead.next;

                return result;
            }
        };
    }

    public void insertAtPosition(int position, T value) {

        if (position < 0)
            throw new IndexOutOfBoundsException("Invalid Position " + position);

        if (position == 0) {
            insertAtBeginning(value);
            return;
        }


        Node newNode = new Node(value);

        Node tempHead = head;

        for (int i = 1; i < position; i++) {
            tempHead = tempHead.next;

            if (tempHead == null)
                throw new IndexOutOfBoundsException("Invalid Position " + position);
        }

        newNode.next = tempHead.next;
        tempHead.next = newNode;
    }

    public void deleteAtPosition(int position) {

        if (position < 0 || head == null)
            throw new IndexOutOfBoundsException("Index out of range " + position);

        if (position == 0) {

            deleteAtBeginning();
            return;
        }

            Node tempHead = head;
            Node previous = null;

            for (int i = 1; i <= position; i++) {
                previous = tempHead;
                tempHead = tempHead.next;

                if (tempHead == null)
                    throw new IndexOutOfBoundsException("Index out of range " + position);
            }

            previous.next = tempHead.next;
    }

    public void deleteAtBeginning() {

        if (head == null)
            throw new IndexOutOfBoundsException("Null value reached" );

        head = head.next;
    }

    public T get(int index){

        Node tempHead = head;

        for(int i=1; i<=index; i++)
            tempHead = tempHead.next;

        return tempHead.data;

    }

    public void update(int position , T value){

        Node tempHead = head;

        for(int i=1; i<=position; i++)
            tempHead = tempHead.next;

        tempHead.data = value;
    }

    public void deleteAtEnd(){

        Node tempHead = head;
        Node previous = null;

        for (int i = 1; tempHead.next != null; i++) {
            previous = tempHead;
            tempHead = tempHead.next;

        }

        previous.next = tempHead.next;
    }

    public void insertAtEnd(T value){

        Node newNode = new Node(value);

        Node tempHead = head;

        for (int i = 1; tempHead.next != null; i++) {
            tempHead = tempHead.next;

        }

        newNode.next = tempHead.next;
        tempHead.next = newNode;
    }

    public int search(T value){

        Node teamHead = head;
        int i = 0;

        while(teamHead != null){

            if(teamHead.data == value)
                return i;

            teamHead = teamHead.next;
            i++;
        }

        return  -1;
    }

    public boolean contain(T value){

        Node teamHead = head;
        int i = 0;

        while(teamHead != null){

            if(teamHead.data == value)
                return true;

            teamHead = teamHead.next;
            i++;
        }

        return  false;
    }

    public int length(){

        Node tempHead = head;
        int length = 0;

        while(tempHead != null){

            length++;

            tempHead = tempHead.next;
        }

        return length;
    }

    public void reverse(){

        Node prev = null;
        Node current = head;

        while(current != null){

            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

    }
}



