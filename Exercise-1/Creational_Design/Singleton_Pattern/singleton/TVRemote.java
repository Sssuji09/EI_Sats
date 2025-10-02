package singleton;

public class TVRemote 
{
    private static TVRemote instance;

    private TVRemote() 
    {
        if(instance!=null)
        {
        System.out.println("TV Remote is already created");
        }
    }

    public static synchronized TVRemote getInstance() 
    {
        if (instance == null) 
        {
            instance = new TVRemote();
        }
        return instance;
    }

    public void turnOnTV() 
    {
        System.out.println("TV is now ON.");
    }

    public void turnOffTV() 
    {
        System.out.println("TV is now OFF.");
    }
}
