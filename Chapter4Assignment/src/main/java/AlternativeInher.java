public class AlternativeInher {

//  Composition takes place in this class as the alternative of inheritance


    Dog doggy = new Dog("Bark", "Four", "Land");
    private String name = "Roxy";

    Pitbull pit = new Pitbull(name, doggy);


    public String toString()
    {
        System.out.println(pit);
        return String.format("This is my dog: %s", pit);
    }







}
