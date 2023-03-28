package p01_p16_and_p18;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class P10_ArmstrongNumber {
    public static void main(String[] args) {
        anyNumber();
    }

    public static void anyNumber() {
        int n, count = 0, a, b, c, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check: ");
        n = input.nextInt();
        a = n;
        c = n;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        while (n > 0) {
            b = n % 10;
            sum = (int) (sum + Math.pow(b, count));
            n = n / 10;
        }
        if (sum == c) {
            System.out.println(c + " is an Armstrong number.");
        } else {
            System.out.println(c + " is not an Armstrong number.");
        }
        input.close();
    }
}
