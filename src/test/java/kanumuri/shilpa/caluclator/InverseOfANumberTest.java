package kanumuri.shilpa.caluclator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class InverseOfANumberTest {
    InverseOfANumber inverseOfANumber;

    @Before
    public void setUp(){
        inverseOfANumber = new InverseOfANumber();

    }

    @Test
    public void inverse(){
        double expected = 0.5;
        double actual = inverseOfANumber.inverse(2);
        Assert.assertEquals(expected,actual,0);
    }
}
