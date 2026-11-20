// public class Prime {
//     public static void main(String[] args) {
//         int n = 29;
//         boolean isPrime = n > 1;
//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         System.out.println(isPrime ? "Prime" : "Not prime");
//     }
// }



import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }

        sc.close();
    }
}
