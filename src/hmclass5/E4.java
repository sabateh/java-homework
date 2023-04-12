package hmclass5;

public class E4 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <50 ; i++) {
            sum=sum+i;
            if(sum>=300){
                System.out.println(sum);
                break;
            }

        }
    }
}
