package class10hm;

public class hm5 {
    public static void main(String[] args) {
        int[][] integer = {
                {1, 20, 3, 55},
                {40, 5, 60, 21},
                {71, 88, 90, 7}
        };
        for (int[] ints : integer) {
            for (int anInt : ints) {
                if(anInt%2==0){
                    System.out.println(anInt);
                }

            }

        }

}}
