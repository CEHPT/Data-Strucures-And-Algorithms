import java.util.Scanner;

public class FLAMES_MAIN {

    public static void main(String args[]){

        FLAMES f = new FLAMES();
        f.getInputs();
        f.afterRemoveLetter();
        f.findFLAMES();
        f.finalResult();

        f = null;

    }
}
