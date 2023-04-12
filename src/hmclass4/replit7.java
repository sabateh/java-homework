package hmclass4;

import java.util.Scanner;

public class replit7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter month number");
        int monthNumber= scanner.nextInt();
        if(monthNumber==1){
            System.out.println("january");
        } else if (monthNumber==2) {
            System.out.println("febriary");


        } else if (monthNumber==3) {
            System.out.println("march");


        } else if (monthNumber==4) {
            System.out.println("april");

        } else if (monthNumber==5) {
            System.out.println("may");

        } else if (monthNumber==6) {
            System.out.println("june");


        } else if (monthNumber==7) {
            System.out.println("july");

        } else if (monthNumber==8) {
            System.out.println("august");

        } else if (monthNumber==9) {
            System.out.println("september");

        } else if (monthNumber==10) {
            System.out.println("october");

        } else if (monthNumber==11) {
            System.out.println("november");

        } else if (monthNumber==12) {
            System.out.println("december");

        }else {
            System.out.println("invalid month number");
        }

    }
}
