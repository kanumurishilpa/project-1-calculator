package kanumuri.shilpa.caluclator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class SquareRootOfANumberTest {

    SquarRootOfANumber squarRootOfANumber;

    @Before
    public void setUp(){

        squarRootOfANumber = new SquarRootOfANumber();
    }

    @Test
    public void squareRoot(){
        double expected = 8;
        double actual = squarRootOfANumber.squareRoot(64);
        Assert.assertEquals(expected,actual,0);
    }
}
