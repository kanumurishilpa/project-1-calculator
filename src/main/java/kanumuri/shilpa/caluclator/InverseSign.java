package kanumuri.shilpa.caluclator;

/**
 * Created by shilpakanumuri on 1/14/17.
 */
public class InverseSign {

    public double changeSign(double number ){
        double sign = 0;

        if(number != 0 && number > 0){
            sign = - number;
            return sign;
        }
       else
            return sign = Math.abs(number);
        }
}
