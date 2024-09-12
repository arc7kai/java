import java.util.Scanner;

public class Subarray {
    public static void Subarrayfun(int arr[]) {
        int ts = 0;  // total subarray count

        // Outer loop to define the start of the subarray
        for (int i = 0; i < arr.length; i++) {
            // Inner loop to define the end of the subarray
            for (int j = i; j < arr.length; j++) {
                int sum = 0;  // sum of the current subarray
                
                // Loop through the subarray from i to j
                for (int k = i; k <= j; k++) {
                    if (k == i) {
                        System.out.print(arr[k]);
                    } else {
                        System.out.print("+" + arr[k]);
                    }
                    
                    // Add current element to the sum
                    sum += arr[k];
                }
                
                // Print the sum of the current subarray
                System.out.print(" =" + sum + "  ");
                ts++;  // Increase total subarray count
            }
            System.out.println();  // New line for better readability
        }
        
        // Print the total number of subarrays
        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String[] args) {
        int arr[] = new int[5];  // Initialize an array of size 5
        Scanner sc = new Scanner(System.in);
        
        // Input array elements
        System.out.println("Enter the Array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function to find and print subarrays
        Subarrayfun(arr);
        sc.close();
    }
}
