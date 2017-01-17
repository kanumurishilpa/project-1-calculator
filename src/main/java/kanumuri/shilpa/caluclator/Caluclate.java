package kanumuri.shilpa.caluclator;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/14/17.
 */
public class Caluclate {

    public static void main(String[] args) throws IOException {

        System.out.println("0");
        boolean clearAndExit = false;

        Engine engine = new Engine();
       while (!clearAndExit) {

           engine.run();
           Scanner ask = new Scanner(System.in);
           System.out.println("If you want to exit please type exit");
           String clearOrExit = ask.nextLine();
           if (clearOrExit.equalsIgnoreCase("exit")) {
               clearAndExit = true;
           }

       }

    }
}
