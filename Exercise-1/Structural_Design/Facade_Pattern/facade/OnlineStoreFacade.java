package facade;

import subsystems.Inventory;
import subsystems.Payment;
import subsystems.Shipping;

public class OnlineStoreFacade 
{
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public OnlineStoreFacade() 
    {
        inventory = new Inventory();
        payment = new Payment();
        shipping = new Shipping();
    }

    public void placeOrder(String product) 
    {
        if (inventory.checkStock(product)) 
        {
            payment.makePayment(product);
            shipping.shipProduct(product);
            System.out.println(product + " order completed");
        }
    }
}
