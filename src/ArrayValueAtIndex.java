import java.util.Scanner;

public class ArrayValueAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayManipulator manipulator = new ArrayManipulator(); // Create an ArrayManipulator object

        try {
            System.out.print("Enter an index to retrieve the corresponding array value: ");
            int index = scanner.nextInt(); // Read the index from user input
            double value = manipulator.getValueAtIndex(index); // Get the value at the specified index
            System.out.println("Array value at index " + index + ": " + value); // Print the retrieved array value
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range."); // Handle ArrayIndexOutOfBoundsException
        }
    }
}
