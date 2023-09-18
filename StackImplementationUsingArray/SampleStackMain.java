package LogicFirstDSA;

//Stack using Array is not efficiant we use linked list is must .
//now we learn just impliment stack in array.


public class SampleStackMain {

    public static void main(String args[]){

        SampleStack stack = new SampleStack();

        stack.push(10);
        stack.push(12);
        stack.push(14);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack = null;
    }
}
