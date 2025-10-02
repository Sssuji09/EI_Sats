import singleton.TVRemote;
public class Main 
{
    public static void main(String[] args) 
    {
        TVRemote remote1 = TVRemote.getInstance();
        TVRemote remote2 = TVRemote.getInstance();

        remote1.turnOnTV();
        remote2.turnOffTV();
        if(remote1==remote2)
        System.out.println("Yes both objects are the same");
    }
}
