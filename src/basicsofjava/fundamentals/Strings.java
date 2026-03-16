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

        System.out.println("STRING METHODS");
        System.out.println("STRINGS ARE IMMUTABLE \n KEY REASONS:\n 1.SECURITY \n 2.STRING CONSTANT POOL EFFICIENCY \n 3.THREADS USABILITY \n" +
                " 4.HASH CODE EFFICIENCY \n 5.CLASS LOADABILITY ");
        System.out.println("CONCATENATION");
        String s="JAVA ";
        String S=new String("DEVELOPER");
        System.out.println(s.concat(S));

        System.out.println("EXPLANTION : \n concat() method creates a new String and make it as JAVA DEVELOPER \n" +
                "whereas s remain JAVA and S remains DEVELOPER its not changed as Strings are immutable");


    }
}
