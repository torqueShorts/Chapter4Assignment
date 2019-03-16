public abstract class LSPmemberViolation {

    private String name;
    private String memberType;
    private String Date;
    private String endDate;

    public LSPmemberViolation()
    {

    }

    public LSPmemberViolation(String nm)
    {
        name = nm;
    }

    public abstract void addToDatabase();

    public abstract void makeBooking();


}
