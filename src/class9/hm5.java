package class9;

public class hm5 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 30};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }

        System.out.println("The largest number is: " + max);
    }
}
