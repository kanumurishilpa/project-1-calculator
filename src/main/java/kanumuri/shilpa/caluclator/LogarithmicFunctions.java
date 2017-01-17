package kanumuri.shilpa.caluclator;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class LogarithmicFunctions {

    public double log(double number){
        double logOfANumber = Math.log(number);
        return logOfANumber ;
    }

    public double inversLog(double number){
        double inversLogOfANumber = Math.log10(number);
        return inversLogOfANumber ;
    }

    public double naturalLog(double number){
        double naturalLogOfANumber = Math.log1p(number);
        return naturalLogOfANumber ;
    }

    public double inverseNaturalLog(double number){
        double inverseNaturalLogOfANumber = Math.exp(number);
        return inverseNaturalLogOfANumber ;
    }


}
