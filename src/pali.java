import java.util.Scanner;

public class pali {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string");
        String word = input.nextLine().toLowerCase();
        int len = word.length();
        int beg = 0;
        int end = len-1;
        boolean condi = true;
        while(beg < end){
            if(word.charAt(beg) != word.charAt(end)){
                condi = false;
                break;
            }
            beg++;
            end--;

        }
        System.out.println(condi);
        }
    }


