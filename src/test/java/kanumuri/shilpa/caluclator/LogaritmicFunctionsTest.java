package kanumuri.shilpa.caluclator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class LogaritmicFunctionsTest {
    LogarithmicFunctions logarithmicFunctions;

    @Before
    public void setUp(){

        logarithmicFunctions = new LogarithmicFunctions();
    }

    @Test
    public void log(){
        double expected = 1;
        double actual = logarithmicFunctions.log(1);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void inverseLog(){
        double expected = 1;
        double actual = logarithmicFunctions.inversLog(3);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void natiralLog(){
        double expected = 1;
        double actual = logarithmicFunctions.naturalLog(4);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void linverseNaturaLog(){
        double expected = 1;
        double actual = logarithmicFunctions.inverseNaturalLog(5);
        Assert.assertEquals(expected,actual,0);
    }
}
