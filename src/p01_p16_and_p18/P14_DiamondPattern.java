package p01_p16_and_p18;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.   While loop
 *  *
 *  ***
 *  *****
 *  *******
 *  *********
 * ***********
 * *************
 * ***********
 *  *********
 *  *******
 *  *****
 *  ***
 *  *
 */
public class P14_DiamondPattern {
    public static void main(String[] args) {
        diamond();
    }
    public static void diamond(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int n = input.nextInt();
        System.out.print("Enter Symbol : ");
        char c = input.next().charAt(0);
        int i = 1;
        int j;
        while (i <= n) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i--;
        }
        input.close();

    }
}
