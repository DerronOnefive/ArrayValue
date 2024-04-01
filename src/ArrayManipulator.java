import java.util.Random;

public class ArrayManipulator {
    private double[] values; // Array to store double values

    // Constructor to initialize ArrayManipulator object with a random array of 50 double values
    public ArrayManipulator() {
        this.values = createRandomArray(50);
    }

    // Method to retrieve the value at a specific index in the array
    public double getValueAtIndex(int index) {
        // Check if index is within the array bounds
        if (index < 0 || index >= values.length) {
            throw new ArrayIndexOutOfBoundsException("Index is out of range.");
        }
        return values[index]; // Return the value at the specified index
    }

    // Method to create a random array of double values with the specified size
    private double[] createRandomArray(int size) {
        Random random = new Random();
        double[] array = new double[size];
        // Fill the array with random double values
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array; // Return the generated array
    }
}
