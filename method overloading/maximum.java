
import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int num1= sc.nextInt();

        System.out.print("enter 2nd number: ");
        int num2=sc.nextInt();

        System.out.print("enter 3rd number: ");
        int num3=sc.nextInt();

        System.out.println("maximum number is: " + maximum(num1,num2,num3));
        maximum(num1,num2,num3);
        
        
    }
    static int maximum(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }
    
}
