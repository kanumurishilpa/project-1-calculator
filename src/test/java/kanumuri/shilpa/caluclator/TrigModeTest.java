package kanumuri.shilpa.caluclator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class TrigModeTest {

   TrigMode trigMode;

    @Before
    public void setUp(){

        trigMode = new TrigMode();
    }

    @Test
    public void toRadians(){
        double expected = 8;
        double actual = trigMode.toRadians(8);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void toDegrees(){
        double expected = 8;
        double actual = trigMode.toDegrees(6);
        Assert.assertEquals(expected,actual,0);
    }
}
