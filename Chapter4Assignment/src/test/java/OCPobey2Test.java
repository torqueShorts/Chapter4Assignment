import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OCPobey2Test {

    OCPobey2 object;

    @Before
    public void setUp() throws Exception {

        object = new OCPobey2("Chad", 24000, 2011);

    }

    @Test
    public void salIncrease() {

        int amount = object.salIncrease(2000);

        Assert.assertEquals("Total amount", 26000, amount);

    }
}