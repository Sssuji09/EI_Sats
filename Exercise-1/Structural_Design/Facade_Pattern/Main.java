import facade.OnlineStoreFacade;

public class Main 
{
    public static void main(String[] args) 
    {
        OnlineStoreFacade store = new OnlineStoreFacade();
        store.placeOrder("HP Printer");
    }
}
