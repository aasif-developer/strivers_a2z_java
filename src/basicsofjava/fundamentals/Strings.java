package basicsofjava.fundamentals;
import java.util.*;
public class Strings {
    public static void main(String[] args) {

        System.out.println("1. CREATING OF STRINGS");

        String s1 = "HELLO";
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

                String str = "Java";
                System.out.println("1. str.length() - returns length of string");
                System.out.println("Length of the string \"" + str + "\" = " + str.length());

                System.out.println();

                System.out.println("2. str.toLowerCase() - converts to lowercase");
                System.out.println("Lowercase of \"" + str + "\" = " + str.toLowerCase());

                System.out.println();

                System.out.println("3. str.toUpperCase() - converts to uppercase");
                System.out.println("Uppercase of \"" + str + "\" = " + str.toUpperCase());

                System.out.println();

                System.out.println("4. str.trim() - removes leading and trailing spaces");
                String s11 = "   Java   ";
                System.out.println("After trimming \"" + s11 + "\" = \"" + s11.trim() + "\"");

                System.out.println();

                System.out.println("5. str.substring(start) - substring from index");
                System.out.println("Substring of \"" + str + "\" from index 2 = " + str.substring(2));

                System.out.println();

                System.out.println("6. str.substring(start,end) - substring range");
                System.out.println("Substring of \"" + str + "\" from index 1 to 3 = " + str.substring(1,3));

                System.out.println();

                System.out.println("7. str.replace('a','x') - replace characters");
                System.out.println("After replacing 'a' with 'x' in \"" + str + "\" = " + str.replace('a','x'));

                System.out.println();

                System.out.println("8. str.startsWith(\"Ja\") - checks start");
                System.out.println("Does \"" + str + "\" start with \"Ja\"? " + str.startsWith("Ja"));

                System.out.println();

                System.out.println("9. str.endsWith(\"va\") - checks end");
                System.out.println("Does \"" + str + "\" end with \"va\"? " + str.endsWith("va"));

                System.out.println();

                System.out.println("10. str.charAt(index) - returns character");
                System.out.println("Character at index 2 in \"" + str + "\" = " + str.charAt(2));

                System.out.println();

                System.out.println("11. str.indexOf(\"av\") - first occurrence");
                System.out.println("Index of \"av\" in \"" + str + "\" = " + str.indexOf("av"));

                System.out.println();

                System.out.println("12. str.indexOf(\"a\",2) - search from index");
                System.out.println("Index of 'a' in \"" + str + "\" from index 2 = " + str.indexOf("a",2));

                System.out.println();

                System.out.println("13. str.lastIndexOf(\"a\") - last occurrence");
                System.out.println("Last index of 'a' in \"" + str + "\" = " + str.lastIndexOf("a"));

                System.out.println();

                System.out.println("14. str.lastIndexOf(\"a\",2) - backward search");
                System.out.println("Last index of 'a' before index 2 in \"" + str + "\" = " + str.lastIndexOf("a",2));

                System.out.println();

                System.out.println("15. str.equals(\"Java\") - compares strings");
                System.out.println("Is \"" + str + "\" equal to \"Java\"? " + str.equals("Java"));

                System.out.println();

                System.out.println("16. str.equalsIgnoreCase(\"java\") - ignores case");
                System.out.println("Is \"" + str + "\" equal to \"java\" (ignore case)? " + str.equalsIgnoreCase("java"));
                System.out.println();

        System.out.println("ADDITONAL STRING METHODS");
        System.out.println();

        String name = "JAVA DEVELOPER";

        System.out.println("1. contains() - checks substring exists");
        System.out.println("Does \"" + name + "\" contain \"av\"? " + name.contains("av"));

        System.out.println();

        System.out.println("2. split() - converts string to array");
        String s12 = "I am Java";
        String[] words = s12.split(" ");
        System.out.println("Splitting \"" + s12 + "\" = " + Arrays.toString(words));

        System.out.println();

        System.out.println("3. toCharArray() - converts string to char array");
        char[] arr = name.toCharArray();
        System.out.println("Character array of \"" + name + "\" = " + Arrays.toString(arr));

        System.out.println();

        System.out.println("4. compareTo() - compares lexicographically");
        System.out.println("Comparing \"apple\" with \"banana\" = " + "apple".compareTo("banana"));

        System.out.println();

        System.out.println("5. compareToIgnoreCase() - compares ignoring case");
        System.out.println("Comparing \"Java\" with \"java\" = " + "Java".compareToIgnoreCase("java"));

        System.out.println();

        System.out.println("6. isEmpty() - checks if string is empty");
        String s13 = "";
        System.out.println("Is the string \"" + s13 + "\" empty? " + s13.isEmpty());

        System.out.println();

        System.out.println("7. isBlank() - checks empty or spaces");
        String s3 = "   ";
        System.out.println("Is the string \"   \" blank? " + s3.isBlank());

        System.out.println();

        System.out.println("8. concat() - joins strings");
        System.out.println("After concatenation: " + name.concat(" World"));

        System.out.println();

        System.out.println("9. valueOf() - converts data type to string");
        int x = 10;
        String s4 = String.valueOf(x);
        System.out.println("Converting int " + x + " to String = " + s4);
    }
}

