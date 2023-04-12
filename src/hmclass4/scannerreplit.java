package hmclass4;

import java.util.Scanner;

public class scannerreplit {
    public static void main(String[] args) {
        Scanner SCAN=new Scanner(System.in);
        System.out.println("enter your name ");
        String name=SCAN.nextLine();
        System.out.println("enter your lastname");
        String lastname=SCAN.nextLine();
        System.out.println(name+" "+lastname);

    }
}
