package replit;

import java.util.Scanner;

public class replit17 {
    public static void main(String[] args) {
    int[] arr = new int[5];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < arr.length; i++) {
        arr[i] = scanner.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] * 10);
    }
}
}
