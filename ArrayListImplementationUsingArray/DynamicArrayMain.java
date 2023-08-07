package LogicFirstDSA;

import java.util.Scanner;



public class DynamicArrayMain {

    public static void main(String[] args){

        int choice , data , pos;

        DynamicArray<Integer> list = new DynamicArray<Integer>();
        Scanner in = new Scanner(System.in);

        do{

            System.out.println("\n\nList Operations");
            System.out.println("----------------");
            System.out.println("1.Insert At end");
            System.out.println("2.Display List");
            System.out.println("3.Insert At position");
            System.out.println("4.Delete At position");
            System.out.println("5.Delete At end");
            System.out.println("6.Delete At Beginning");
            System.out.println("7.Insert At Beginning");
            System.out.println("8.Get element by position");
            System.out.println("9.Update value");
            System.out.println("10.Search particular value");
            System.out.println("11.Contains the value (True/False)");
            System.out.println("12.Clear array");
            System.out.println("13.Exit");

            System.out.println("Enter your choice(1-13) : ");
            choice = in.nextInt();

            switch (choice){

                case 1:
                    System.out.println("\nEnter the Data : ");
                    data = in.nextInt();

                    list.add(data);
                    break;

                case 2:
                    System.out.println("List Elements");
                    System.out.println("--------------");

                    list.display();
//                    for(int n : list){
//                    } we can use foreach because we overwire interator interface good luck.
                    break;

                case 3:
                    System.out.println("Enter the position (position start at 0) : ");
                    pos = in.nextInt();

                    if(pos < 0){
                        System.out.println("Invalid Position Press Any Enter to continue....");
                        in.nextLine();
                        continue;
                    }

                    System.out.println("Enter the Data : ");
                    data = in.nextInt();

                    list.insertAtPosition(pos , data);
                    break;

                case 4:
                    System.out.println("Enter the position to delete (Position start at 0) : ");
                    pos = in.nextInt();

                    if(pos < 0){
                        System.out.println("Invalid Position Press Any Enter to continue....");
                        in.nextLine();
                        continue;
                    }

                    list.deleteAtPosition(pos);
                    break;

                case 5:
                    list.deleteAtEnd();
                    break;

                case 6:
                    list.deleteAtBeginning();
                    break;

                case 7:
                    System.out.println("Enter the value : ");
                    data = in.nextInt();

                    list.insertAtBeginning(data);
                    break;

                case 8:
                    System.out.println("Enter the position (position start at 0) : ");
                    pos = in.nextInt();

                    System.out.println(list.get(pos));
                    break;

                case 9:
                    System.out.println("Enter the position : ");
                    pos = in.nextInt();

                    System.out.println("Enter the value : ");
                    data = in.nextInt();

                    list.update(pos , data);
                    break;

                case 10:
                    System.out.println("Enter the value : ");
                    data = in.nextInt();

                    System.out.println(list.search(data));
                    break;

                case 11:
                    System.out.println("Enter the value : ");
                    data = in.nextInt();

                    System.out.println(list.contains(data));
                    break;

                case 12:

                    list.clear();
                    System.out.println("List Elements all clear");
                    break;

                case 13:
                    System.exit(0);
                    break;

                default:
                    System.out.println("INVALID OPTION PRESS ANY KEY TO GO MAIN MENU........");
                    in.nextLine();
                    continue;
            }

        }while(choice != 13);


    }
}
