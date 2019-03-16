public class LSPviolation extends LSPmemberViolation{

//    This class tries to make a query
//    This class was not suppose to be able to make a booking through the method "makeBooking"
//    However it has to initiate all the abstract methods of the class it is extending thus
//    it violates LSP.


    public void addToDatabase()
    {
        System.out.println("Member added to database");
    }

    public void makeBooking()
    {
        System.out.println("Member made a booking");
    }


}
