import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        // You have been given a positive no, identify whether the number is odd or even
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Positive Number: ");
        int n = sc.nextInt();
        check(n);
    }
    public static void check(int n){
        if((n & 1) == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
