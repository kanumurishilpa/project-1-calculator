package kanumuri.shilpa.caluclator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class FactorialTest {
    Factorial factorial;

    @Before
    public void setUp(){
        factorial = new Factorial();

    }

    @Test
    public void factorial(){
        double expected = 24;
        double actual = factorial.factorial(4);
        Assert.assertEquals(expected,actual,0);
    }
}
