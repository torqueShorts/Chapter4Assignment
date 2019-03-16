

public class Dog implements Animal{

    private String speak = "Bark";
    private String legs = "Four";
    private String element = "Land";
    private String active;

    public Dog()
    {

    }

    public Dog(String sp, String le, String el)
    {
        speak = sp;
        legs = le;
        element = el;
    }



    public String legs()
    {
        return legs;
    }

    public String element()
    {
        return element;
    }

    public String speak()
    {
        return speak;
    }


    public String activity()
    {
        active = "My dog likes to play fetch";
        return active;
    }


    public String toString()
    {
        String holder = activity();
        return String.format("My dog can %s, My dog is a %s animal, My dog has %s legs, %s", speak, element, legs, holder);
    }


}
