//main.c

#include <stdio.h>

// Function to add two numbers
void addTwoNumbers(int j, int i) {
    int k = i + j;
    printf("Sum: %d\n", k);
}

// Function to subtract two numbers
void subtractTwoNumbers(int j, int i) {
    int k = i - j;
    printf("Difference: %d\n", k);
}

// Main function
int main() {
    int j = 10;
    int i = 10;

    // Call the function to add two numbers
    addTwoNumbers(j, i);

    // Call the function to subtract two numbers
    subtractTwoNumbers(j, i);

    return 0;
}