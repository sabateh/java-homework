import java.util.Scanner;

public class LOGICAL {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("are you thirsthy");
    boolean thirsty   = scanner.nextBoolean();
        System.out.println("are you sleeoy");
    boolean sleepy  =scanner.nextBoolean();
    if(thirsty&& sleepy){
        System.out.println("drink coffe");
    } else if (!thirsty&&sleepy) {
        System.out.println("drink tea");

        }else {
        System.out.println("nothing");
    }
}}
