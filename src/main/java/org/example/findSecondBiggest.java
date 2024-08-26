package org.example;

public class findSecondBiggest {
    public class SecondBiggestFinder {
        public static int findSecondBiggestIntegerFromInput(int[] numbers) {
            if (numbers.length < 2) {
                throw new IllegalArgumentException("Array must contain at least two elements.");
            }

            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int number : numbers) {
                if (number > first) {
                    // Update both first and second if the current number is greater than the largest
                    second = first;
                    first = number;
                } else if (number > second && number < first) {
                    // Update second if the current number is between the first and second
                    second = number;
                }
            }
            return second;
        }

        public static void main(String[] args) {
            // Test cases
            int[] arr1 = {1, 2, 3, 4, 5};

            // Call the findSecondBiggest method
            System.out.println("Second biggest = " + findSecondBiggestIntegerFromInput(arr1));
        }
    }


}
