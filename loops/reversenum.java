
import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number");
        int num= sc.nextInt();
        int reverse=0;
        while(num>0){
            int a= num%10;
            reverse= reverse*10+a;
            num=num/10;
        }
        System.out.println("reverse number is " + reverse);
    }
}
