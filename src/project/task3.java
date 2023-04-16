package project;

public class task3 {
    public static void main(String[] args) {
        int[][] numbers={
                {1,12,5,2},
                {4,3,5,7},
                {6,9,11,13}
        };
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");

            }


            }
            System.out.println();

        }
    }
}
