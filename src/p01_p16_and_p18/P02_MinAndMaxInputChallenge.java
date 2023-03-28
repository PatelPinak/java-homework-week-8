package p01_p16_and_p18;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 * 3. Write a Java program that takes the user to provide a sing
 */

public class P02_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        P02_MinAndMaxInputChallenge obj = new P02_MinAndMaxInputChallenge();
        obj.readNumbers();
    }
    public void readNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number or type -1 to stop : ");
        int number = input.nextInt();
        int max = number;
        int min = number;

        while (number != -1) {
            if (number > max) {                     // if and else if condition
                max = number;
            } else if (number < min) {
                min = number;
            }
            System.out.print("Enter a number or type -1 to stop : ");
            number = input.nextInt();
        }

        if ( max != -1 && min != -1) {
            System.out.println("Maximum was " + max);
            System.out.println("Minimum was " + min);
        }
        input.close();
    }
}