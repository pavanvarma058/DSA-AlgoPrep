import java.util.Scanner;

public class ceil {
    public static void main(String[] args) {
        // ceil (greater or equal integer)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();
        System.out.println(Math.ceil(num));
    }
}
