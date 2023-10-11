import java.util.Random;
import java.util.Scanner;

public class generator {
    public static void main(String[] args){
        Random rr = new Random();
        Scanner num = new Scanner(System.in);
        while(true) {
            int a = rr.nextInt(10);

            System.out.println("Enter a num");
            int b = num.nextInt();
            System.out.println("Random is "+a);
            if (b==a){
                System.out.println("Yay same");
                break;
            }
            else {
                System.out.println("Quit?");

                String c = num.next();
                if (c.equals("Quit")) {
                    break;
                }
            }
        }
    }
}