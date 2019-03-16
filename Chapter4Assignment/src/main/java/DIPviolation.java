public class DIPviolation {

    private DIPdatabaseViolation database;

    public DIPviolation()
    {
        database = new DIPdatabaseViolation();
    }

    public void connect()
    {
        database.connect();
    }

    public void disconnect()
    {
        database.disconnect();
    }


}
