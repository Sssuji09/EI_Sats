package concrete_products;
import product.Car;

public class Sedan implements Car 
{
    public void design() 
    {
        System.out.println("Designing Sedan with rooftop");
    }
    
    public void manufacture() 
    {
        System.out.println("Manufacturing Sedan with power engine");
    }
    
    public void qualityCheck() 
    {
        System.out.println("Performing quality checks on Sedan");
    }
    
    public void deliver() 
    {
        System.out.println("Sedan is ready for delivery\n");
    }
}