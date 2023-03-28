package p01_p16_and_p18;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class P09_FibonacciNumber {
    public static void main(String[] args) {
        myNumber();
    }
    public static void myNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter count value :");
        int count = scan.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; a<=count ; i++){
            System.out.println(b);
            int sum = a + b;
            a=b;
            b=sum;
        }
        scan.close();
    }
}
