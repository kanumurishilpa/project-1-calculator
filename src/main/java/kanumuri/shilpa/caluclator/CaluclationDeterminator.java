package kanumuri.shilpa.caluclator;

import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/14/17.
 */
public class CaluclationDeterminator {

    SimpleCaluclator simpleCaluclator;
    Factorial factorial;
    InverseOfANumber inverseOfANumber;
    InverseSign inverseSign;
    LogarithmicFunctions logarithmicFunctions;
    SquareOfANumber squareOfANumber;
    SquarRootOfANumber squarRootOfANumber;
    TrigFunctions trigFunctions;
    TrigMode trigMode;
    VariableExponential variableExponential;

    public CaluclationDeterminator() {

        simpleCaluclator = new SimpleCaluclator();
        factorial = new Factorial();
        inverseOfANumber = new InverseOfANumber();
        inverseSign = new InverseSign();
        logarithmicFunctions = new LogarithmicFunctions();
        squareOfANumber = new SquareOfANumber();
        squarRootOfANumber = new SquarRootOfANumber();
        trigFunctions = new TrigFunctions();
        trigMode = new TrigMode();
        variableExponential = new VariableExponential();

    }


    public double returnValue(double number, String option, double secondnumber) {

        double result = 0;
        Options.SimpleCaluclations simpleCaluclation = Options.SimpleCaluclations.valueOf(option.toUpperCase());


        switch (simpleCaluclation) {
            case ADD : result = simpleCaluclator.sum(number, secondnumber);
                break;
            case SUBTRACT: result = simpleCaluclator.subtract(number, secondnumber);;
                break;
            case DIVIDE: result = simpleCaluclator.divide(number, secondnumber);;
                break;
            case MULTIPLY: result = simpleCaluclator.product(number, secondnumber);;
                break;
            case VARIABLEEXPONENTIAL: result = variableExponential.exponential(number,secondnumber);
                break;
            default: new RuntimeException("Err");

        }
        return result;
    }



    public double returnValue(double number,String option){
        double result = 0;
        Options.OneInputOperations oneInputOperations = Options.OneInputOperations.valueOf(option.toUpperCase());

        switch (oneInputOperations) {
            case INVERSE:  result = inverseOfANumber.inverse(number);
                break;
            case INVERSESIGN: result = inverseSign.changeSign(number);
                break;
            case LOG: result = logarithmicFunctions.log(number);
                break;
            case INVERSELOG: result = logarithmicFunctions.inversLog(number);
                break;
            case NATURALLOG: result = logarithmicFunctions.naturalLog(number);
                break;
            case INVERSENATURALLOG: result = logarithmicFunctions.inverseNaturalLog(number);
                break;
            case SQUARE: result = squareOfANumber.square(number);
                break;
            case SQUAREROOT: result = squarRootOfANumber.squareRoot(number);
                break;
            case SIN: result = trigFunctions.sin(number);
                break;
            case COS: result = trigFunctions.cos(number);
                break;
            case TAN: result = trigFunctions.tan(number);
                break;
            case ASIN: result = trigFunctions.asin(number);
                break;
            case ACOS: result = trigFunctions.acos(number);
                break;
            case ATAN: result = trigFunctions.atan(number);
                break;
            case DEGREES: result = trigMode.toDegrees(number);
                break;
            case RADIANS: result = trigMode.toRadians(number);
                break;
        }
        return result;

    }


    public double returnVaue(String option){
        ClearDisplay clearDisplay = new ClearDisplay();
        double value = clearDisplay.clear();
        return value;
    }
}
