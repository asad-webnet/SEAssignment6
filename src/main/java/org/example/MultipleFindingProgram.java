package org.example;

public class MultipleFindingProgram {
    public static void printOutputBasedOnMultiple(int[] nums) {
        for (int number : nums) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("HelloWorld");
            } else if (number % 5 == 0) {
                System.out.println("Hello");
            } else if (number % 7 == 0) {
                System.out.println("World");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 7, 10};

        printOutputBasedOnMultiple(numbers);
    }
}
