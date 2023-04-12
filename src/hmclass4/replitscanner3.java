package hmclass4;

import java.util.Scanner;

public class replitscanner3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name");
        String name=scan.nextLine();
        System.out.println("enter your phone number");
        String phonenumber=scan.nextLine();
        System.out.println("enter your age");
        int age=scan.nextInt();
        System.out.println("Your name is"+name+" your age is "+age+" and your mobile number is"+phonenumber);
    }}