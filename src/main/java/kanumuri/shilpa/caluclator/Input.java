package kanumuri.shilpa.caluclator;

import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/14/17.
 */
public class Input {

    private Scanner scanner;
    private Display display;
    private ClearDisplay clearDisplay;

    public Input() {
        scanner = new Scanner(System.in);
        display = new Display();
        clearDisplay = new ClearDisplay();
    }

    public double askUserForNumber() {
        display.printToScreen("Enter a number: ");
        double number = scanner.nextDouble();
        scanner.nextLine();
        return number;
    }

    public String askUserForOperator() {
        display.printToScreen("Enter Operator: ");
        String option = scanner.nextLine();
        return option;
    }

    public double askUserForSecondNumber() {
        display.printToScreen("Enter Another Number: ");
        double secondNumber = scanner.nextDouble();
        return secondNumber;
    }

    public double clearTheScreen(){
        clearDisplay.clear();
        double clearScreen = 0;
        return clearScreen;
    }
}
