package p01_p16_and_p18;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input.
 * If the user input   Is not a letter (between a and z or A and Z), or
 * is a string of length > 1, print an  error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class P03_Vowel_Consonant {
    public static void main(String[] args) {
        P03_Vowel_Consonant obj = new P03_Vowel_Consonant();
        obj.input();

    }

    public void input() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Entered character " + ch + " is Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Entered character " + ch + " is Consonant");
        else
            System.out.println("Not an alphabet");
        scanner.close();
    }
}
