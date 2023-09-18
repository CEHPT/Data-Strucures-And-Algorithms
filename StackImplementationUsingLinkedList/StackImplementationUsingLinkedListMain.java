package LogicFirstDSA;

public class StackImplementationUsingLinkedListMain {

    public static void main(String[] args){

        StackImplementationUsingLinkedList<String> sl = new StackImplementationUsingLinkedList<>();

        sl.push("Kalai");
        sl.push("Kumutha");
        sl.push("Karthika");
        sl.push("Kamala");

        while (!sl.isEmpty())
            System.out.println(sl.pop());
//        System.out.println(sl.peek());
//        System.out.println(sl.peek());
//        System.out.println(sl.pop());
//        System.out.println(sl.pop());
//        System.out.println(sl.pop());
//        System.out.println(sl.pop());


        sl = null;
    }
}
