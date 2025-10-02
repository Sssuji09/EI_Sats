package concrete_strategy;
import strategy.SortingStrategy;

public class SelectionSort implements SortingStrategy 
{
    public void sort(int[] array) 
    {
        System.out.println("Using Selection Sort");
        int n = array.length;   
        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (array[j] < array[minIndex]) 
                {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}