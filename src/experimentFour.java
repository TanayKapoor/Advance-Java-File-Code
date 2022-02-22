import java.util.Scanner;

public class experimentFour {
    //    Finding Maximum in an array
    static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //    Finding Minimum in an array
    static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //    Exception handling
    static class subtractionExceptionPositive extends Exception {
        public subtractionExceptionPositive() {
            super("Subtract is greater than or equals zero");
        }
    }

    static class subtractionExceptionNegative extends Exception {
        public subtractionExceptionNegative() {
            super("Subtract is less than zero");
        }
    }

    static int subtraction(int[] arr) throws subtractionExceptionPositive, subtractionExceptionNegative {
        int sub = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sub -= arr[i] - arr[i + 1];
            if (sub < 0) {
                throw new subtractionExceptionPositive();
            }
            if (sub >= 0) {
                throw new subtractionExceptionNegative();
            }
        }
        return sub;
    }


    public static void main(String[] args) throws subtractionExceptionPositive, subtractionExceptionNegative {
        System.out.println("Tanay 1955991593");
        Scanner sc = new Scanner(System.in);

//        Taking input
        int[] arr = new int[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

//        Printing results
        System.out.println("Maximum: " + findMaximum(arr));
        System.out.println("Minimum: " + findMinimum(arr));
        System.out.println("Subtraction: " + subtraction(arr));
    }
}
