package faktoriyel;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();
        int fact = 1;
        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println(number + "!=" + fact);
        } else {
            System.out.println(number + "! " + "factorials of negative numbers cannot be calculated");
        }
    }

}
