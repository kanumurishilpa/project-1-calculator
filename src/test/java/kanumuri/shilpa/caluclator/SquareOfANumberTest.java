package kanumuri.shilpa.caluclator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class SquareOfANumberTest {
    SquareOfANumber squareOfANumber;

    @Before
    public void setUp(){

        squareOfANumber = new SquareOfANumber();
    }

    @Test
    public void square(){
        double expected = 64;
        double actual = squareOfANumber.square(8);
        Assert.assertEquals(expected,actual,0);
    }
}
