package basicsofjava.fundamentals;
import java.util.*;
public class UserInputOutput {
        public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int a =obj.nextInt();
        System.out.println("YOU HAVE ENTERED  :"+ a);
    }
}
