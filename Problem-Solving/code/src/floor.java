import java.util.Scanner;

public class floor {
    public static void main(String[] args) {
        // floor (smaller or equal integer)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();
        System.out.println(Math.floor(num));
    }
}
