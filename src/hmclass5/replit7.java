package hmclass5;

import java.util.Scanner;

public class replit7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = scan.nextInt();
        System.out.println("enter num2");
        int num2 = scan.nextInt();
        System.out.println("enter num3");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("the largest number is" + num1);

        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("the largest number is" + num2);
        } else {
            System.out.println("the largest number is" + num3);
        }
    }
}