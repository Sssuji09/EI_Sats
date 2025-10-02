import factory.CarFactory;
import product.Car;
import concrete_factory.*;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Production: Sedan");
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        sedan.design();
        sedan.manufacture();
        sedan.qualityCheck();
        sedan.deliver();
        
        System.out.println("Production: SUV");
        CarFactory suvFactory = new SUVFactory();
        Car suv = suvFactory.createCar();
        suv.design();
        suv.manufacture();
        suv.qualityCheck();
        suv.deliver();
    }
}