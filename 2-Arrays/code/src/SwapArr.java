public class SwapArr {
    public static void main(String[] args) {
        // Swap 2 values in the array
        int[] arr = {10, 20};
        swap(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        // arrays across functions are always connected
    }

    private static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
