package project;

public class task1 {
    public static void main(String[] args) {


    int[]tempweek={12,13,13,14,15,18,19};
    int high=tempweek[0];
    int low=tempweek[0];
        for (int i = 0; i < tempweek.length; i++) {
            if (tempweek[i]>high){
                high=tempweek[i];

            } else if (tempweek[i]<low) {
                low=tempweek[i];


            }

        }
        System.out.println("high temp is "+high);
        System.out.println("low temp is"+low);
}}
