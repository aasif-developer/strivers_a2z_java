package basicsofjava.fundamentals;
import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("REVERSING A NUMBER USING WHILE LOOP");
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER :");
        int n = sc.nextInt();
        while(n>0)
        {
            int a=n%10;
            System.out.print(a);
            n=n/10;
        }
        System.out.println();
        System.out.print("ENTER N VALUE :");
        int N=sc.nextInt();
        int i=1;
        do {
            System.out.println(i);
            i++;
        }
        while(i<=N);
    }
}


