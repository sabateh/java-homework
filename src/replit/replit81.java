package replit;

public class replit81 {
    public static void main(String[] args) {
        int [] num={5,4,8};
        int largest=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>largest){
                largest=num[i];
                System.out.println(largest);
            }

        }
    }
}
