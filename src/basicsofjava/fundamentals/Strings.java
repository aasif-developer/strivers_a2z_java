package basicsofjava.fundamentals;
import java.util.*;
public class Strings{
    public static void main(String[] args) {

        System.out.println("1. CREATING OF STRINGS");

        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("String s1 = " + s1);
        System.out.println("String s2 = " + s2);

        System.out.println();

        System.out.println("2. ==[CHECKS MEMORY] VS .equals()[CHECKS CONTENT]");

        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println("a == b : " + (a == b));
        System.out.println("a == c : " + (a == c));
        System.out.println("a.equals(b) : " + a.equals(b));
        System.out.println("a.equals(c) : " + a.equals(c));

        System.out.println("");
    }
}
