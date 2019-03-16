public class SRPviolation {

    private String userName;
    private String userPassword;

    private String validName = "Cindy";
    private String validPassword = "RedCrossStat";


    public String loginDetails(String name, String password)
    {
        userName = validName;
        userPassword = validPassword;

        if(userName.equals(validName) && userPassword.equals(validPassword))
        {
            return "information valid";
        }

        else
        {
            return "information not valid";
        }

    }


    public String removeUser(String name, String password)
    {

        userName = " ";
        userPassword = " ";

        if(userName.equals(validName) && userPassword.equals(validPassword) )
        {
            return "valid";
        }
        else
        {
            return "not valid";
        }

    }




}
