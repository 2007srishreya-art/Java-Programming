
import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st num: ");
        int num1= sc.nextInt();
        System.out.println("enter 2nd num: ");
        int num2= sc.nextInt();
        System.out.println("multiply of these number is: " + multiply(num1,num2));
        multiply(num1,num2);
        
    }
    static int multiply(int a, int b){
        return a*b;
    }
    
}
