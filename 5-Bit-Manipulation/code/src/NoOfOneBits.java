import java.util.Scanner;

public class NoOfOneBits {
    public static void main(String[] args) {
        // LeetCode link: https://leetcode.com/problems/number-of-1-bits/description/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
