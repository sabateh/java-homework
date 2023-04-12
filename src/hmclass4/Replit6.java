package hmclass4;

import java.util.Scanner;

public class Replit6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the first number");
        int x= scanner.nextInt();
        System.out.println("please enter the second number");
        int y= scanner.nextInt();
        if (x*y>0){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
