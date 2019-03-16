public class LSPmemberObey implements LSPdatabaseObey, LSPbookingObey {

    public void addToDatabase()
    {
        System.out.println("Member added to database");
    }

    public void makeBooking()
    {
        System.out.println("Member has made a booking");
    }

}
