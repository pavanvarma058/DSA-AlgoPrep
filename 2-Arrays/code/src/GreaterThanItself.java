public class GreaterThanItself {
    public static void main(String[] args) {
        // Given N elements, Count total no.of elements having at least 1 element
        // greater than itself
        int[] arr = {3, 4, 11, 8, 2, 10, 9, 11};
        System.out.println(countGreater(arr));

    }
    public static int countGreater(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        int count = 0;
        for (int j : arr) {
            if (j == max) {
                count++;
            }
        }

        return arr.length - count;
    }
}
