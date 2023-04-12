package hmclass5;

import java.util.Scanner;

public class E1whileloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("pls enter the starting point ND THE ENDING POINT");
        int start= scanner.nextInt();
        int end= scanner.nextInt();
        int num=start;
        while (num<=end){
            System.out.println(num+" ");
            num++;
        }
    }
}
