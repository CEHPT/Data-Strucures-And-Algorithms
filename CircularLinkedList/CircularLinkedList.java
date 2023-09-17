package LogicFirstDSA;

public class CircularLinkedList<T> {

    private Node last;

    public class Node{

        private T data;
        private Node next;

        Node(T data){

            this.data = data;
            next = null;
        }
    }


    CircularLinkedList(){
        last = null;
    }

    public void insertAtBeginning(T data){

        Node newNode = new Node(data);

        if(last == null) {

            last = newNode;
            last.next = newNode;
        }
        else {

            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void insertAtEnd(T data){

        Node newNode = new Node(data);

        if(last == null) {

            last = newNode;
            last.next = newNode;
        }
        else {

            newNode.next = last.next;
            last.next = newNode;
        }

        last = newNode;
    }

    public void display(){

        if(last == null)
            return;

        Node tempLast = last;

        do{

            System.out.print(tempLast.data + " ");
            tempLast = tempLast.next;

        }while(tempLast.next != last.next);

        System.out.println();
    }

    public void deleteAtBeginning(){

        Node tempLast = last;

        if(tempLast == null)
            throw new IndexOutOfBoundsException("NO Node found");

        else if(tempLast.next == tempLast)
            tempLast = null;

        else
            tempLast.next = tempLast.next.next;

    }

    public void deleteAtEnd(){

        if(last == null)
            throw new IndexOutOfBoundsException("NO Node found");

        else if(last.next == last)
            last = null;

        else{

            Node tempLast = last.next;

            while(tempLast.next != last){

                tempLast = tempLast.next;
            }

            tempLast.next = last.next;
            last = tempLast;
        }
    }

    public void deleteVal(T data){

        if(last == null)
            throw new IndexOutOfBoundsException("No Data Found ");

        if(last.data == data) {
            deleteAtEnd();
            return;
        }

        Node tempLast = last.next;
        Node previous = last;

        if(tempLast.data == data){

            deleteAtBeginning();
            return;
        }

        do{
            if(tempLast.data == data) {
                previous.next = tempLast.next;
                return;
            }

            tempLast = tempLast.next;
            previous = previous.next;

        }while(tempLast.next != last.next);

    }

    public boolean contain(T data){

        Node tempNode = last.next;

        do{

            if(tempNode.data == data)
                return true;

            tempNode = tempNode.next;

        }while(tempNode.next != last.next);

        return false;
    }

    public int size(){

        if(last == null)
            return 0;

        int size = 0;

        Node tempNode = last.next;

        do{
            size++;
            tempNode = tempNode.next;

        }while(tempNode != last.next);

        return size;
    }
}
