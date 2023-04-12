package hmclass4;

import java.util.Scanner;

public class Replit5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the length");
        int length= scanner.nextInt();
        System.out.println("please enter the width");
        int width= scanner.nextInt();
        if (length==width){
            System.out.println("square");
        }else {
            System.out.println("rectangle");
        }
    }
}
