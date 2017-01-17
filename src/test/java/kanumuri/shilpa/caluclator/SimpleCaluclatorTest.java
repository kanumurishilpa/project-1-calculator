package kanumuri.shilpa.caluclator;

import org.junit.Assert;
import org.junit.Before;
import kanumuri.shilpa.caluclator.SimpleCaluclator;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class SimpleCaluclatorTest {

    SimpleCaluclator  basicCaluclator;

    @Before
    public void setUp(){
        basicCaluclator = new SimpleCaluclator();

    }

    @Test
    public void sum(){
        double expected = 15;
        double actual = basicCaluclator.sum(4,11);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void divide(){
        double expected = 3;
        double actual = basicCaluclator.divide(12,4);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void product(){
        double expected = 2;
        double actual = basicCaluclator.product(4,.5);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void subtract(){
        double expected = -7;
        double actual = basicCaluclator.subtract(4,11);
        Assert.assertEquals(expected,actual,0);
    }
}
