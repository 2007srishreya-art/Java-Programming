
import java.util.Scanner;

public class numprint {
    public static void main(String[] args) {
        //  for(int i=1; i<=100; i++){
        //     System.out.println(i);
        //  }
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
    
}
