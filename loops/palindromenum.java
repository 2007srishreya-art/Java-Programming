
import java.util.Scanner;

public class palindromenum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        int original=num;
        int revrese=0;

        while(num>0){
            int a=num%10;
            revrese=revrese*10+a;
            num=num/10;


        }
        if(original==revrese){
            System.out.println("this is your palindrome number " );

        }else{
            System.out.println("this is not palindrome number");
        }
    }

    
}
