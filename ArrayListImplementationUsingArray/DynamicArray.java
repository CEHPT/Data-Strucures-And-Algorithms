package LogicFirstDSA;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T>{

    private T arr[];
    private int size , capacity;
    private final int initialSize = 8;

    @SuppressWarnings("unchecked")
    public DynamicArray(){

        capacity = initialSize;
        size = 0;

        arr = (T[]) new Object[initialSize];
    }

    public void add(T value){

        if(capacity == size)
            expand();

        arr[size++] = value;
    }

    private void expand(){

        capacity *= 2;

        arr = Arrays.copyOf(arr , capacity);
    }

    public void display(){

        for(T value : arr)
            System.out.print(value + " ");
    }

    public void insertAtPosition(int position , T data){

        if(size == capacity)
            expand();

        for(int i=size-1; i>=position; i--)
            arr[i + 1] = arr[i];

        arr[position] = data;
        size++;
    }

    public void deleteAtPosition(int position){

        if(position > capacity) {
            System.out.println("Invalid Position...");
            return;
        }

        for(int i=position; i<size; i++)
                arr[i] = arr[i + 1];

        size--;

        if(capacity > initialSize && capacity > 3 * size)
            shrink();
    }

    private void shrink(){
        capacity /= 2;

        arr = Arrays.copyOf(arr,capacity);
    }

    public int length(){
        return size;
    }

    public int capacity(){
        return capacity;
    }

    public void deleteAtEnd(){

        deleteAtPosition(size-1);
    }

    public void deleteAtBeginning(){

        deleteAtPosition(0);
    }

    public void insertAtBeginning(T value){

        insertAtPosition(0 , value);
    }
    public int get(int index){

        return (int) arr[index];
    }

    public void update(int index , T value){

        arr[index] = value;
    }

    public int search(T value){

        for(int i=0; i<size; i++)
            if(arr[i] == value)
                return i;

        return -1;
    }

    public boolean contains(T value){

        for(T item : arr)
            if(item == value)
                return true;

        return false;
    }

    public void clear(){

        capacity = initialSize;
        size = 0;

        arr = (T[]) new Object[initialSize];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>(){

            int index = 0;
            public boolean hasNext(){

                return index < size;
            }

            public T next(){
                return arr[index++];
            }
        };
    }
}
