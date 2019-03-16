import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PitbullTest {

    Dog dog;

    @Before
    public void setUp() throws Exception {
        dog = new Dog();
    }

    @Test
    public void pitbullSound() {

        String result = dog.speak();

        Assert.assertEquals("The sound my pitbull makes: ", "Bark", result);

        System.out.println("The sound my pitbull makes: " + result);

    }

    @Test
    public void pitbullLegCount() {

        String result = dog.legs();

        Assert.assertEquals("The amount of legs my pitbull has: ", "Four", result);

        System.out.println(result);

    }

    @Test
    public void pitbullElement() {

        String result = dog.element();

        Assert.assertEquals("The type of animal my pitbull is: ", "Land", result);

        System.out.println(result);
    }

    @Test
    public void pitbullActivity() {

        String result = dog.speak();

        Assert.assertEquals("The activity my pitbull likes to do: ", "My dog likes to play fetch", result);

        System.out.println(result);

    }
}