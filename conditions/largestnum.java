package conditions;

import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int n=sc.nextInt();
        int number=sc.nextInt();
        if(num>n && num>number){
            System.out.println("greater number is" + num);
        }else if(n>num && n>number){
            System.out.println("greatest number is" + n);
        }else {
            System.out.println("greatest number is" + number);
        }
    }
    
}
