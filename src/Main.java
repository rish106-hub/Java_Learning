import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Starting point of the program
        System.out.println("Hello world!");
        //variable
        int a = 10;
        String name = "Rishav";
        //Types of Java variables
        //There are 2 types of variables:- Primitive and Non-primitive
        byte b = 20; // Primitive data type [-128 to 127] 1 byte
        short s = 1000; // Primitive data type [-32,768 to 32,767] 2 bytes
        int i = 100000; // Primitive data type [-2,147,483,648 to 2,147,483,647] 4 bytes
        long l = 10000000000L; // Primitive data type [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807] 8 bytes
        float f = 10.5f; // Primitive data type [1.4E-45 to 3.4028235E38] 4 bytes
        double d = 20.5; // Primitive data type [4.9E-324 to 1.7976931348623157E308] 8 bytes
        char c = 'A'; // Primitive data type [0 to 65,535] 2 bytes
        boolean isTrue = true; // Primitive data type [true or false] 1 byte
        String test = "Hello World"; // Non-primitive data type (String)
        //Printing variables
        System.out.println("Integer: " + i);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + isTrue);
        System.out.println("String: " + test);
        //very important to note that for long we need to use L at the end of the number and F for at the end of the float number
    }
}