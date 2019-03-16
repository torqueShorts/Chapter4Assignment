import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    Animal cat;

    @Before
    public void setUp() throws Exception {

        cat = new Cat();
    }

    @Test
    public void legs() {

        String result = cat.legs();

        Assert.assertEquals("The amount of legs my cat has: ", "Four", result);

        System.out.println(result);

    }

    @Test
    public void element() {

        String result = cat.activity();

        Assert.assertEquals("The type of animal my cat is: ", "Land", result);

        System.out.println(result);

    }

    @Test
    public void speak() {

        String result = cat.activity();

        Assert.assertEquals("The sound my cat makes: ", "Meow", result);

        System.out.println(result);

    }

    @Test
    public void activity() {

        String result = cat.activity();

        Assert.assertEquals("The activity my cat likes doing: ", "My cat likes to play with a ball of yarn", result);

        System.out.println(result);

    }
}