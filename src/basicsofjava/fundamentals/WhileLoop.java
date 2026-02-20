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
        System.out.println("SUM OF NUMBERS FROM 1 TO N");
        System.out.println("ENTER N VALUE");
        int N1=sc.nextInt();
        int sum=0;
        for(int i7=1;i7<=N1;i7++)
        {
          sum=sum+i7;
        }
        System.out.println("SUM OF NUMBERS 1 TO "+N1+" IS " +sum);
        //O(1) COMPLEXITY
        int N2=5;
        int sum1 =N2*(N2+1)/2;
        System.out.println(sum1);
    }
}


