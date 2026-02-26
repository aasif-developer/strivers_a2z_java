package basicsofjava.fundamentals;
import java.util.*;
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

        System.out.println("CREATING ARRAY FROM USER INPUT");
        Scanner sc=new Scanner(System.in);
        int[] arr3=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr3[i]=sc.nextInt();
        }
        System.out.println("THE ARRAY ELEMENTS ARE :");
        System.out.println("PRINTING ELEMENTS USING FUNCTION:");
        System.out.println(Arrays.toString(arr3));

        System.out.println("PRINTING ELEMENTS USING FOR LOOP:");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        System.out.println("Different data types using array:");
        String[] arr4={"abc","def","ghi"};
        Double[] arr5={99.1,99.2,99.3,99.4};
        Float[] arr6={1.0f,2.0f,3.0f,4.0f};
        System.out.println("STRING DATA TYPE :"+Arrays.toString(arr4));
        System.out.println("DECIMAL DATA TYPE :"+Arrays.toString(arr5));
        System.out.println("FLOAT DATA TYPE :"+Arrays.toString(arr6));
        System.out.println("ARRAY OPERATIONS:");
        System.out.println("SORTING OF ARRAY");
        int[] arr7 = {5,2,9,1,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr7));
        System.out.println("SLICING OF ARRAY");
        int[] arr8 = {10,20,30,40,50};
        int[] sub = Arrays.copyOfRange(arr8, 1, 4);
        System.out.println(Arrays.toString(sub));
        System.out.println("UPDATING OF ARRAY");
        arr8[0]=100;
        System.out.println(Arrays.toString(arr8));
        System.out.println("REVERSING AN ARRAY");
        int[] arr9= {10, 20, 30, 40, 50};
        int left = 0;
        int right = arr9.length - 1;
        while (left < right) {
            int temp = arr9[left];
            arr9[left] = arr9[right];
            arr9[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr9));
    }
}
