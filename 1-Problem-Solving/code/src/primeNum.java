import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        // Given a number N, check if the number is a prime
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Given number: " + n + " is a prime number");
        }else{
            System.out.println("Given number: " + n + " is not a prime number");
        }
    }
    static boolean isPrime(int n){
        int count = 0;
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                if(i == n/i){count += 1;}
                else {count += 2;}
            }
        }
        return count == 2;
    }
}
// 2*2*2*2*2*2
