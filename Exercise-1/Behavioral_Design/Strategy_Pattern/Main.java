import context.Sorter;
import concrete_strategy.*;
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) 
    {
        int[] numbers1 = {64, 34, 25, 12, 22, 11, 90};
        int[] numbers2 = {64, 34, 25, 12, 22, 11, 90};
        
        Sorter sorter = new Sorter(new BubbleSort());
        sorter.performSort(numbers1);
        System.out.println("Result: " + java.util.Arrays.toString(numbers1));
        System.out.println();
        
        sorter.setStrategy(new SelectionSort());
        sorter.performSort(numbers2);
        System.out.println("Result: " + java.util.Arrays.toString(numbers2));
    }
}