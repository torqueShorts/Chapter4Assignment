import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlternativeInherTest {

    AlternativeInher inherit;

    @Before
    public void setUp() throws Exception {

        inherit = new AlternativeInher();
    }

    @Test
    public void toStringTest() {

        String result = inherit.toString();

        Assert.assertEquals("This is my dog: ", "This is my dog: My dog's name is Roxy, My dog can Bark, My dog is a Land animal, My dog has Four legs, My dog likes to play fetch", result);
    }
}