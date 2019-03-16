public class LSPobey implements LSPdatabaseObey{

//    Now that the methods have been created in two separate interfaces the LSPObey class can only
//    implement the methods of the one interface and does not have access to the other method in
//    the LSPbookingObey interface because LSPObey is not a member.


    public void addToDatabase()
    {
        System.out.println("Member added to database");
    }



}
