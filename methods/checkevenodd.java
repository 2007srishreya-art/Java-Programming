
import java.util.Scanner;

public class checkevenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number: ");
        int num= sc.nextInt();
        check(num);
    }
    static void check(int num){
        if(num%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}
