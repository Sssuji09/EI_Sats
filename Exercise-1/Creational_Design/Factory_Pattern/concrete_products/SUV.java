package concrete_products;
import product.Car;

public class SUV implements Car 
{
    public void design() 
    {
        System.out.println("Designing SUV with AI assistant");
    }
    
    public void manufacture() 
    {
        System.out.println("Manufacturing SUV with electric engine");
    }
    
    public void qualityCheck() 
    {
        System.out.println("Performing quality checks on SUV");
    }
    
    public void deliver() 
    {
        System.out.println("SUV is ready for delivery\n");
    }
}