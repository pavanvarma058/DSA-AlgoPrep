import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
        // Sum of N natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = n * (n+1) / 2;
        System.out.println(sum);
    }
}
