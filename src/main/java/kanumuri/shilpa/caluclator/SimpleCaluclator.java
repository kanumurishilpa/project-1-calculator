package kanumuri.shilpa.caluclator;

/**
 * Created by shilpakanumuri on 1/14/17.
 */
public class SimpleCaluclator {

    public double sum(double number , double secondnumber){
        return number + secondnumber ;
    }

    public double product(double number , double secondnumber) {
        return number * secondnumber ;
    }

    public double subtract(double number , double secondnumber) {
        return number - secondnumber ;
    }

    public double divide(double number , double secondnumber) {
        if(secondnumber != 0){
            return number / secondnumber ;
        }else {
            throw new RuntimeException("Number Cannot be Divisible by 0");
        }

    }

}
