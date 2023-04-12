package hmclass5;

import java.util.Scanner;

public class replit6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num= scan.nextInt();
        if(num%2==0){
            System.out.println("value is even");
            if (num>1000){
                System.out.println("even number is large");
            }else {
                System.out.println("even number is jest right");
            }
        }else {
            System.out.println("number is odd" );
            if (num>1000){
                System.out.println("odd value is large");
            }else {
                System.out.println("odd value is just right");
            }
        }
    }}