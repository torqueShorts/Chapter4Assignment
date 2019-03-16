import sun.java2d.pipe.DrawImagePipe;

public class DIPobey {

    private DIPdatabaseObey database;
    private DIPsqlDatabaseObey sqlDatabase;

    public DIPobey()
    {
        database = new DIPdatabaseObey();
        sqlDatabase = new DIPsqlDatabaseObey();
    }

    public void connect()
    {
        database.connect();
        sqlDatabase.connect();
    }

    public void disconnect()
    {
        database.disconnect();
        sqlDatabase.disconnect();
    }




}
