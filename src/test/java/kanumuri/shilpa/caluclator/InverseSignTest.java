package kanumuri.shilpa.caluclator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class InverseSignTest {
    InverseSign inverseSign;

    @Before
    public void setUp(){
        inverseSign = new InverseSign();

    }

    @Test
    public void positiveToNegative(){
        double expected = -4;
        double actual = inverseSign.changeSign(4);
        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void negativeToPositive(){
        double expected = 8;
        double actual = inverseSign.changeSign(-8);
        Assert.assertEquals(expected,actual,0);
    }
}
