package hmclass4;

import java.util.Scanner;

public class hm3 {
    public static void main(String[] args) {
       // Create a Java program that will ask user to input city and temperature.
            //    Your program should convert Fahrenheit into celsius and print “The temperature is
       // the city __ is __”
        Scanner scan=new Scanner(System.in);
        System.out.println("enter city ");
        String city=scan.nextLine();

        System.out.println("what is the temp");
        double far= scan.nextDouble();

        double cel=((32*(far-32))/9.0);
        System.out.println("the temp is the city "+city+" is"+ cel);


    }
}
