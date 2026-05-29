
import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter here number");
        int a= sc.nextInt();
        triplet(a*a*a);
    }
    static void triplet(int a){
        System.out.println("cube is " + a);
    }
    
}
