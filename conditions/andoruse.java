package conditions;

import java.util.Scanner;

public class andoruse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number: ");
        int num= sc.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println("this number is divisible by both ");
        }else{
            System.out.println("this is not divisible by both");
        }
    }
    
}
