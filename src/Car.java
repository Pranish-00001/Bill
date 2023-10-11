import java.util.Scanner;

public class Car {
    public static void main(String[] args){
        int i=0;
        int j=0;
        Scanner car = new Scanner(System.in);

        while (true){
            System.out.println("Enter a command: START/STOP/QUIT");
            String C1 = car.next();
            if ((C1.equals("START"))){
                if(i==1){
                    System.out.println("Already started");
                }
                else {
                    System.out.println("Started");
                    i=1;
                }
            }
            else if(C1.equals("STOP")){
                if(j==1){
                    System.out.println("Already Stopped");
                }
                else {
                    System.out.println("Stopped");
                    i=0;
                    j=1;
                }
            }
            else if (C1.equals("Quit")){
                break;
            }
        }
    }
}
