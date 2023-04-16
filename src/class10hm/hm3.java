package class10hm;

public class hm3 {
    public static void main(String[] args) {
        String[][] grocery = {
                {"Potato", "Tomato", "Onion", "Pepper", "Garlic", "Ginger"},
                {"Apple", "Pears", "Orange", "Mango", "Grapes"},
                {"Milk", "Yogurt", "Cheese", "Butter"},
                {"Chocolate", "Candy", "Snickers", "Twix", "Kit Kat"}

        };
        for (int i = 0; i < grocery.length ; i++) {
            for (int j = 0; j < grocery[i].length ; j++) {
                System.out.print(grocery[i][j]+" ");

            }
            System.out.println();

            }
        for (String[] strings : grocery) {
            for (String string : strings) {
                System.out.println(string+" ");

            }

        }

        }
    }

