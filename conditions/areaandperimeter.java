package conditions;

import java.util.Scanner;

public class areaandperimeter {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length: ");
        int length= sc.nextInt();
        System.out.println("enter the breath: ");
int breath= sc.nextInt();
        int area= length*breath;
        System.out.println("area is: " + area);
        int perimeter= 2*(length+breath);
        System.out.println("perimeter is: " + perimeter);
        if(area>perimeter){
            System.out.println("area is greater than perimeter: " + perimeter);

        }else{
            System.out.println("perimeter is greater thaan area: " + area);
        }

    }
    
}
