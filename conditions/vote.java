package conditions;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age");
        int age=s.nextInt();
        if(age>18){
            System.out.println("your are eligible for vote");
        }else{
            System.out.println("you are not eligible for vote");
        }

    }
    
}
