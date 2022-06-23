package asalsayi;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();
        boolean isPrime = true;
        if (number == 1) {
            System.out.println("Not Prime Number");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime Number");
            }
        }
    }
}