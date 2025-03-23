import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an array of size 10 which will take integers
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the value at index " + i + " position: ");
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}