
import java.util.Scanner;

public class maxthreenum {
    public static void main(String[] args) {
        // maximum(7,10,14);
    Scanner sc= new Scanner(System.in);
    System.out.println("enter first number: ");
    int a=sc.nextInt();
    System.out.println("enter second number: ");
    int b= sc.nextInt();
    System.out.println("enter third number: ");
    int c= sc.nextInt();
    }
    maximum(a,b,c);
    static void maximum(int a, int b, int c){
        if(a > b) {
System.out.println("a is max number");
        }else if(b>c){
            System.out.println("b is max number");
        }else if(c>a){
            System.out.println("c is max number");
        }else{
            System.out.println("every number is equal");
        }
    }
    
}
