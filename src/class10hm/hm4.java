package class10hm;

public class hm4 {
    public static void main(String[] args) {
            int[][] integer = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
        int sum = 0;
        for (int[] ints : integer) {
            for (int intNum : ints) {
                sum = intNum + sum;

            }

        }
        System.out.println(sum);


    }
}
