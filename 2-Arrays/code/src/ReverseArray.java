import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        // Given array of length N, Reverse the whole array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        // create a array
        int[] arr = new int[n];
        // insert the elements in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }

    public static void reverse(int[] arr){
        int sp = 0;
        int ep = arr.length - 1;

        while (sp<ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
