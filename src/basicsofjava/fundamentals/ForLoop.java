package basicsofjava.fundamentals;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //2n   ---->even numbers
        //2n+1 ---->odd numbers
        System.out.println("1.WRITE A PROGRAM TO PRINT FIRST N ODD NUMBERS");
        System.out.print("ENTER A VALUE : ");
        int a =obj.nextInt();
        for(int i1=1;i1<=a;i1++)
        {
            System.out.println(2*i1+1);
        }
        System.out.println("2.PRINT ODD NUMBERS TILL N");
        System.out.print("ENTER N VALUE : ");
        int n= obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }
        System.out.println("3.PRINT FIRST N NATURAL NUMBERS IN REVERSE ORDER");
        System.out.println("ENTER N VALUE");
        int b=obj.nextInt();
        for(int i=b;i>=1;i--)
        {
            System.out.println(i);
        }
    }
}

