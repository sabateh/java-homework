package project;

public class task8 {
    public static void main(String[] args) {
        int [] num={22,14,25,18,11,17};
        int min=num[0];
        int max=num[0];
        for (int i = 0; i < num.length ; i++) {
            if(num[i]>max){
                max=num[i];


        } else if (num[i]<min) {
                min=num[i];


            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
