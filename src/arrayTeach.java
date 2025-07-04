public class arrayTeach {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers1= new int[5]; // Declaring an array of size 5
        numbers1[0] = 1; // Assigning value to the first element
        numbers1[1] = 2; // Assigning value to the second element
        numbers1[2] = 3; // Assigning value to the third element
        numbers1[3] = 4; // Assigning value to the fourth element
        numbers1[4] = 5; // Assigning value to the fifth element
        // Printing the array
        System.out.println("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // New line for better readability
        System.out.println("Array elements from numbers1: ");
        for (int number : numbers1) {
            System.out.print(number + " ");
        }
        // Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modifying an array element
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        // Looping through the array
        System.out.print("All elements in the array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Array length
        System.out.println("\nLength of the array: " + numbers.length);
    }

}
