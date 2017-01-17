package kanumuri.shilpa.caluclator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class TrigFunctionsTest {

    TrigFunctions trigFunctions;

    @Before
    public void setUp(){

        trigFunctions = new TrigFunctions();
    }

    @Test
    public void sine(){
        double expected = 8;
        double actual = trigFunctions.sin(8);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void cos(){
        double expected = 8;
        double actual = trigFunctions.cos(8);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void tan(){
        double expected = 8;
        double actual = trigFunctions.tan(8);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void asin(){
        double expected = 8;
        double actual = trigFunctions.asin(8);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void acos(){
        double expected = 8;
        double actual = trigFunctions.acos(8);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void atan(){
        double expected = 8;
        double actual = trigFunctions.atan(8);
        Assert.assertEquals(expected,actual,0);
    }
}
