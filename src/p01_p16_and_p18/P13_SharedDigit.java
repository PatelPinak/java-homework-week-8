package p01_p16_and_p18;

import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not  within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;  otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers NOTE: The method hasSharedDigit should be defined as public static
 */
public class P13_SharedDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        System.out.println("Result: "+hasSharedDigit(a, b));
        input.close();
    }
    public static boolean hasSharedDigit(int p, int q) {
        if (p<10 || q>99)
            return false;
        int x = p % 10;
        int y = q % 10;
        p /= 10;
        q /= 10;
        return (p == q || p == y || x == q || x == y);
    }
}
