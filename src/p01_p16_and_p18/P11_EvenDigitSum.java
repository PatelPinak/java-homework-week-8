package p01_p16_and_p18;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.  The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.  EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class P11_EvenDigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();
        System.out.println("Sum of even numbers is: " + getEvenDigitSum(number));
        input.close();
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int digit = 0;
        if (number > 0) {
            while (number != 0) {
                digit = number % 10;
                if (digit % 2 == 0) {
                    sum = sum + digit;
                }
                number = number / 10;
            }
            return sum;
        } else {
            sum = -1;
            return sum;
        }
    }
}
