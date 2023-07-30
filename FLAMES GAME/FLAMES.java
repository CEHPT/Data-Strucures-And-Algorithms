import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class FLAMES {
    private String name1 , name2 , result;
    int totalCountOfLetters;
    public FLAMES(){

        totalCountOfLetters = 0;
        startFLAMES();
    }
    public String getName1(){

        return name1;
    }
    public String getName2(){

        return name2;
    }
    public String getResult() {

        return result;
    }
    public int getTotalCountOfLetters(){

        return totalCountOfLetters;
    }

    private void startFLAMES(){

        System.out.println("F L A M E S");
        System.out.println("-------------------");
    }
    public void getInputs(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name  : ");
        name1 = in.nextLine().toLowerCase();

        System.out.print("\nEnter your partner name :");
        name2 = in.nextLine().toLowerCase();
    }
    public void afterRemoveLetter(){

        int[] name1Array = new int[26];
        int[] name2Array = new int[26];

       for(char c : name1.toCharArray())
           name1Array[c-97]++;

       for(char c : name2.toCharArray())
           name2Array[c-97]++;

       for(int i=0; i<26; i++)
           totalCountOfLetters += Math.abs(name1Array[i] - name2Array[i]);

    }

    public void findFLAMES(){

        ArrayList<Character> flames = new ArrayList<>() {{
            add('f');
            add('l');
            add('a');
            add('m');
            add('e');
            add('s');
        }};

        int currentCount = 0;

        do{

            int temp = totalCountOfLetters % flames.size();
            currentCount = (temp - 1 + currentCount + flames.size()) % flames.size();
            flames.remove(currentCount);

        }while(flames.size() > 1);

        result = String.valueOf(flames.get(0));
    }

    public void finalResult(){

        System.out.println();

        switch (result.toUpperCase()){

            case "F":
                System.out.println("F : Friends");
                break;

            case "L":
                System.out.println("L : Love");
                break;

            case "A":
                System.out.println("A : Affection");
                break;

            case "M":
                System.out.println("M : Marriage");
                break;

            case "E":
                System.out.println("E : Enemies");
                break;

            case "S":
                System.out.println("S : Soulmates");
                break;
        }
    }
}
