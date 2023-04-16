package project;

public class task5 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println("number before swiping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("number after swiping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }}