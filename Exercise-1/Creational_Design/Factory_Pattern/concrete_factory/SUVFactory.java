package concrete_factory;
import factory.CarFactory;
import product.Car;
import concrete_products.SUV;

public class SUVFactory implements CarFactory 
{
    public Car createCar() 
    {
        return new SUV();
    }
}