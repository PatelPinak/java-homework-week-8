package p01_p16_and_p18;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.   For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class P06_NumberTriangle {
    public static void main(String[] args) {
        P06_NumberTriangle obj = new P06_NumberTriangle();
        obj.triangle();
    }

    public void triangle() {
        int i, j, n;
        System.out.println("Input number of rows : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
        input.close();
    }
}
