public class LSPlifetimeMemberObey implements LSPdatabaseObey, LSPbookingObey {


    public void addToDatabase()
    {
        System.out.println("Member added to database");
    }

    public void makeBooking()
    {
        System.out.println("Member made a booking");
    }


}
