public class Pitbull extends Dog{

    Dog pitty = new Dog();


//    These methods and the constructor are used for composition purposes

    private Dog doggy;
    private String name;

    public Pitbull(String nm, Dog dogzie)
    {
        name = nm;
        doggy = dogzie;
    }


    public String pitbullSound() {

        return pitty.speak();
    }

    public String pitbullLegCount()
    {
       return pitty.legs();
    }

    public String pitbullElement()
    {
        return pitty.element();
    }

    public String pitbullActivity()
    {
        return "My dog likes to play fetch";
    }


//    This is used for Composition

    public String toString()
    {
        return String.format("My dog's name is %s, %s", name, doggy);
    }



}
