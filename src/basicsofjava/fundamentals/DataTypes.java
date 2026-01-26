package basicsofjava.fundamentals;
class DataTypes {
    public static void main(String[] args) {

        System.out.println("PRIMITIVE DATA TYPES");

        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 100000L;

        float f = 3.14f;
        double d = 3.14159;

        char c = 'A';
        boolean flag = true;

        System.out.println("1. byte    : " + b + " (1 byte)");
        System.out.println("2. short   : " + s + " (2 bytes)");
        System.out.println("3. int     : " + i + " (4 bytes)");
        System.out.println("4. long    : " + l + " (8 bytes)");
        System.out.println("5. float   : " + f + " (4 bytes)");
        System.out.println("6. double  : " + d + " (8 bytes)");
        System.out.println("7. char    : " + c + " (2 bytes)");
        System.out.println("8. boolean : " + flag + " (JVM dependent)");

        System.out.println();
        System.out.println("NON-PRIMITIVE DATA TYPES");

        String name = "Aasif";
        System.out.println("1. String  : " + name);

        int[] arr = {1, 2, 3};
        System.out.println("2. Array   : " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        Student st = new Student();
        st.id = 101;
        System.out.println("3. Class/Object : Student id = " + st.id);

        Demo d1 = new DemoImpl();
        d1.show();
    }
}
class Student {
    int id;
}
interface Demo {
    void show();
}
class DemoImpl implements Demo {
    public void show() {
        System.out.println("4. Interface : Implemented using class");
    }
}
