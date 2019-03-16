public class SRPobey {

    private String userName;
    private String userPassword;

    private String validName = "Cindy";
    private String validPassword = "RedCrossStat";



    public String loginDetails(String name, String password)
    {
        userName = validName;
        userPassword = validPassword;

        if(userName.equals(validName))
        {
            return "information valid";
        }

        else
        {
            return "information not valid";
        }

    }




}
