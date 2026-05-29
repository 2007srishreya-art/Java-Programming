package conditions;

import java.util.Scanner;

public class nestedif {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number: ");
        int a= sc.nextInt();
        
        if(a%5==0 || a%3==0){
            System.out.println("this number is divisible by both");
              if(a%15!=0){
                System.out.println("this is not  divisible by 15");
              }
              else{
                System.out.println("invalid number");
              }
        }
        else{
            System.out.println("invalid number");
        }
        
    }
    
}
