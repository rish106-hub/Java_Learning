public class StringTeach {
    public static void main(String[] args) {
            String name1="Rishav";
            String name2="Dewan";
            String name3=name1 + "and" + name2;
            System.out.println(name3);
            System.out.println(name1.charAt(0));   // prints the first character of name1
            System.out.println(name2.substring(0, 3)); // prints the first three characters of name2
            System.out.println(name1.toUpperCase()); // converts name1 to uppercase
            System.out.println(name2.toLowerCase()); // converts name2 to lowercase
            System.out.println(name1.equals(name2)); // checks if name1 is equal to name2
            System.out.println(name1.equalsIgnoreCase(name2)); // checks if name1 is equal to name2 ignoring case
        }
    }
// This code demonstrates basic string operations in Java.
