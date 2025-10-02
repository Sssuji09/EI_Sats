package concrete_factory;
import factory.CarFactory;
import product.Car;
import concrete_products.Sedan;

public class SedanFactory implements CarFactory
{
    public Car createCar() 
    {
        return new Sedan();
    }
}
