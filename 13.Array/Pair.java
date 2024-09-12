import java.util.Scanner;

public class Pair {
    public static void Pairfun(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(" (" + arr[i] + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pair :" + tp);
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Pairfun(arr);
        sc.close();
    }

}
