import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OCPviolationTest {

    OCPviolation object;

    @Before
    public void setUp() throws Exception {

        object = new OCPviolation("Chad", 24000, 2011);

    }

    @Test
    public void salIncrease() {

        int amount = object.salIncrease(2000);

        Assert.assertEquals("Total amount", 26000, amount);





    }
}