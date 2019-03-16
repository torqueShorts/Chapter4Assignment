import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SRPobeyTest {

    SRPobey object;
    @Before
    public void setUp() throws Exception {

        object = new SRPobey();

    }

    @Test
    public void loginDetails() {

        String confirm = object.loginDetails("Cindy", "RedCrossStat");
        Assert.assertEquals("Checking to use if user details are valid", "information valid", confirm);

        System.out.println(confirm);
    }
}