package basicsofjava.fundamentals;
import java.util.*;
public class Arrays
{
    public static void main(String[] args)
    {
        System.out.println("CREATING AN ARRAY");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i;
            System.out.println(arr[i]);
        }
    }

}
