public class UniqueElement {
    public static void main(String[] args) {
        // Given add[N], every element appears twice except for
        // one element which appears once,  find that unique element
        int[] arr = {6, 8, 6, 7, 10, 7, 8};
        unique(arr);
    }
    public static void unique(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
