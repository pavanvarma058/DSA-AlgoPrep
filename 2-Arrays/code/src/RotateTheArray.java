public class RotateTheArray {
    public static void main(String[] args) {
        // Given N elements, Rotate the array from last to first by K times
        int[] arr = {3, -2, 1, 4, 6, 9, 8};
        int k = 3;
        int n = arr.length;
        k = k % n;
        // step 1: reverse the whole array
        reverseArr(arr, 0, n-1);

        // step 2: reverse the first k element
        reverseArr(arr, 0, k-1);

        // step 3: reverse the elements after kth element
        reverseArr(arr, k, n-1);

        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

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
