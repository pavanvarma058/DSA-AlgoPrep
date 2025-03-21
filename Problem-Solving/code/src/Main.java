import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Given a number N, print the count of factors
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(countFactors(n));
        // Optimized this in the function
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if(n % i == 0){
//                count++;
//            }
//        }
//        System.out.println(count);
    }

    static  int countFactors(int n){
        int count = 0;
        for(int i=1; i*i <= n; i++){
            if(n % i == 0){
                if(i == n/i) {count += 1;}
                else {count += 2;}
            }
        }
        return count;
    }
}