package basicsofjava.fundamentals;
import java.util.Scanner;
public class UserInputOutput
{
        public static void main(String[] args)
        {
                System.out.println("1.INTEGER AS AN INPUT");
                Scanner obj = new Scanner(System.in);
                System.out.print("ENTER A NUMBER : ");
                int a =obj.nextInt();
                System.out.println("YOU HAVE ENTERED  :"+ a);
                System.out.println("2.CHARACTER AS AN INPUT");
                System.out.print("ENTER A CHARACTER : ");
                char b=obj.next().charAt(0);
                System.out.println("YOU HAVE ENTERED  :"+ b);
                System.out.println("3.STRING AS AN INPUT");
                System.out.print("ENTER A STRING : ");
                obj.nextLine();
                String c=obj.nextLine();
                System.out.println("YOU HAVE ENTERED  :"+ c);
                System.out.println("4.FLOAT AS AN INPUT");
                System.out.print("ENTER A DECIMAL NUMBER : ");
                float d=obj.nextFloat();
                System.out.println("YOU HAVE ENTERED  :"+ d);
        }
}
