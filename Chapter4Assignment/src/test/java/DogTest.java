import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    Animal object;

    @Before
    public void setUp() throws Exception {

        object = new Dog();

    }

    @Test
    public void legsTest() {

        String result = object.legs();

        Assert.assertEquals("The amount of legs a dog has: ", "Four", result);

        System.out.println("The amount of legs a dog has: " + result);

    }

    @Test
    public void elementTest() {

        String result = object.element();

        Assert.assertEquals("The type of animal that a dog is: ", "Land", result);

        System.out.println("The type of animal that a dog is: " + result);

    }

    @Test
    public void speakTest() {

        String result = object.speak();

        Assert.assertEquals("The sound my dog makes: ", "Bark", result);

        System.out.println("The sound my dog makes: " + result);

    }

    @Test
    public void activity() {

        String result = object.activity();

        Assert.assertEquals("The activity my dog likes doing: ", "My dog likes to play fetch", result);

        System.out.println(result);

    }
}