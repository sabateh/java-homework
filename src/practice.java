public class practice {
    public static void main(String[] args) {
        boolean[]num={true,false,true};
        int sum=0;
        for (int i = 0; i < num.length ; i++) {
            if (!num[i]){
                sum++;

        }

        }
        System.out.println(sum);
    }
}
