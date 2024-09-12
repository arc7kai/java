import java.util.Scanner;

public class Sorting {
    public static void sortArray(int arr[]) {
        int swap;
        int end = arr.length;

        // Bubble Sort
        for (int i = 0; i < end - 1; i++) {
            for (int j = 0; j < end - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        // Print the sorted array
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Here is the sorted Array:");
        sortArray(arr);
        sc.close();
    }
}
