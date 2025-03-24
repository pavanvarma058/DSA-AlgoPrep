import java.util.Scanner;

public class ReversePartOfArray {
    public static void main(String[] args) {
        // Given N array element and [s,e], reverse the array from [s,e].
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // insert the elements in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter starting point: ");
        int s = sc.nextInt();
        System.out.print("Enter ending point: ");
        int e = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverseArr(arr, s, e);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
    public static void reverseArr(int[] arr, int s, int e){
        int sp = s;
        int ep = e;

        while (sp<ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
