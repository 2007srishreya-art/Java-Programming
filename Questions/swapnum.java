
import java.util.Scanner;

public class swapnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first numbers");
        int a=sc.nextInt();

        System.out.println("enter your second number");
        int b=sc.nextInt();

        int temp;
        temp=a;
        a=b;
        b=temp;
        
        System.out.println("after swapping");
        System.out.println("a " + a);
        System.out.println("b " + b);
    
        }
        
    }
    

