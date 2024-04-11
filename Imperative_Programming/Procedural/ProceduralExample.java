//procedural.java

public class ProceduralExample {

    // Main function
    public static void main(String[] args) {
        int j = 10;
        int i = 10;

        // Call the method to add two numbers
        addTwoNumbers(j, i);
        
        // Call the method to subtract two numbers
        subtractTwoNumbers(j, i);
    }

    // Method to add two numbers
    private static void addTwoNumbers(int j, int i) {
        int k = i + j;
        System.out.println("Sum: " + k);
    }

    // Method to subtract two numbers
    private static void subtractTwoNumbers(int j, int i) {
        int k = i - j;
        System.out.println("Difference: " + k);
    }
}