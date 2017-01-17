package kanumuri.shilpa.caluclator;

/**
 * Created by shilpakanumuri on 1/14/17.
 */
public class Engine {

    private Input input;
    private CaluclationDeterminator calculationDeterminator;
    private Display display;
    private SelectOptions selectOptions;

    public Engine() {
        input = new Input();
        calculationDeterminator = new CaluclationDeterminator();
        display = new Display();
        selectOptions = new SelectOptions();
    }

    public double run() {
        double number = input.askUserForNumber();
        String option = input.askUserForOperator();
        double answer = 0;
        boolean ask = selectOptions.askNextNumber(option);
        if (ask ){
            double secondnumber = input.askUserForSecondNumber();
            answer = calculationDeterminator.returnValue(number,option,secondnumber);
            display.printToScreen("The answer is " + answer);
        }else {
            answer = calculationDeterminator.returnValue(number,option);
            display.printToScreen("The answer is " + answer);
        }
        return answer;
    }


}
