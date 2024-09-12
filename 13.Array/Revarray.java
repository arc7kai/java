import java.util.Scanner;

public class Revarray {
    public static void Revarrayfun(int arr[]) {
        int end = arr.length - 1;
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[end - i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Here is the Reverse Array Elements:");
        Revarrayfun(arr);
        sc.close();
    }
}
