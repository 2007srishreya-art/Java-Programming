
import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter number");
        int number= s.nextInt();
        System.out.println("here is your number");
        for(int i=1; i<=number; i++){
            System.out.println(i);
        }
    }
    
}
