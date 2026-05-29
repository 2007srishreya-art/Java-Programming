
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        // for(int i= 1; i<=10; i++){
        //     System.out.println(12*i);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num:");
        int num= sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num*i);
        }
        
    }
}
