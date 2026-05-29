
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num= sc.nextInt();
        int a= 0;
        int b=1;
        for(int i=1; i<=5; i++){
            num= a+b;
        }
        System.out.println(num);


    }

    
}
