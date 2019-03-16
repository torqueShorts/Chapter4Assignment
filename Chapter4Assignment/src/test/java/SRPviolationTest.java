import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SRPviolationTest {

    SRPviolation object;
    @Before
    public void setUp() throws Exception {

        object = new SRPviolation();

    }

    @Test
    public void loginDetails() {

        String confirm = object.loginDetails("Cindy", "RedCrossStat");
        Assert.assertEquals("Confirming in user details are valid", "information valid",confirm);
    }

//    automatically deletes user details
    @Test
    public void removeUser() {

        String confirm = object.removeUser("Cindy", "RedCrossStat");
        Assert.assertEquals("Confirming in user details are valid", "valid",confirm);
    }
}