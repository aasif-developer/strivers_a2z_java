package basicsofjava.fundamentals;
import java.util.Arrays;
public class Array
{
    public static void main(String[] args)
    {
        System.out.println("CREATING AN ARRAY USING FOR LOOP");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i;
            System.out.println(arr[i]);
        }
        System.out.println("CREATING AN ARRAY MANUALLY");
        int[] arr1={10,20,30,40,50};
        System.out.println(Arrays.toString(arr1));
        System.out.println("LENGTH OF THE ARRAY ="+arr.length);
        System.out.println("ELEMENTS OF THE ARRAY");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("CREATING AN ARRAY USING NEW KEYWORD");
        int[] arr2;
        arr2=new int[]{100,101,102};
        System.out.println(Arrays.toString(arr2));
    }
}
