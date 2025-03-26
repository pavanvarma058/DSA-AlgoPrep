public class TwoSum {
    public static void main(String[] args) {
        // Given N elements, check if there exists a pair(i, j) such that arr[i]+arr[j] = k and i!=j
        int[] arr = {3, 5, 2, 7, 5};
        int k = 12;
        System.out.println(twoSum(arr, k));
    }
    public static boolean twoSum(int[] arr, int k){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }
}
