package hmclass5;

public class E3WHILELOOP {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {

                sum = sum + i ;
            }
            i++;


        }
        System.out.println(sum);

    }}