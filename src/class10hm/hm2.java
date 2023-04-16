package class10hm;

public class hm2 {
    public static void main(String[] args) {
        String[][] cars ={
                {"Ford", "Mustang", "Chevy", "Dodge", "Tesla"},
                {"BMW", "Mercedes", "Audi", "Volkswagen"},
                {"Hyundai", "Kia", "Genesis"},
                {"Ferrari", "Fiat", "Alfa Romeo", "Maserati"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (String[] carArray : cars) {
            for (String carName : carArray) {
                System.out.print(carName + " ");
            }
            System.out.println();
        }
    }
}

