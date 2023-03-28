package p01_p16_and_p18;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class P08_RightAngleTriangle {
    public static void main(String[] args) {
        P08_RightAngleTriangle obj = new P08_RightAngleTriangle();
        obj.display();
    }
    public void display(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows of triangle: ");
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("@");
            }
            System.out.println("");
        }
        input.close();
    }
}
