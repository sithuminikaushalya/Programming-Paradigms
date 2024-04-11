// OOP.java

package com.example.calculator; // Package declaration

// Main class for the calculator program
public class OOP {
    static int j = 10; // First operand
    static int i = 10; // Second operand

    // Main method where the program execution starts
    public static void main(String[] args) {
        Addition add = new Addition(); // Create an instance of the Addition class
        Subtraction subtract = new Subtraction(); // Create an instance of the Subtraction class
        
        // Print the result of addition
        System.out.println("Addition Result: " + add.addTwoNumbers(j, i));
        
        // Print the result of subtraction
        System.out.println("Subtraction Result: " + subtract.subtractTwoNumbers(j, i));
    }
}

// Class for performing addition operation
class Addition {
    // Method to add two numbers
    public int addTwoNumbers(int j, int i) {
        return i + j; // Return the sum of the two numbers
    }
}

// Class for performing subtraction operation
class Subtraction {
    // Method to subtract two numbers
    public int subtractTwoNumbers(int j, int i) {
        return i - j; // Return the difference of the two numbers
    }
}
