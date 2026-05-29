
import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your dividend: ");
        int a= sc.nextInt();
        System.out.println("enter your divisior: ");
        int b= sc.nextInt();
        int q= a/b;
        System.out.println("first ... here is quatient: " + q);
        int r= a-b*q;

        System.out.println(" and here is remainder: " +r);


        }
    }
    

