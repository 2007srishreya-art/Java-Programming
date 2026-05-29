package array;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your array size");
        int size= sc.nextInt();

System.out.println("enter your element: ");
        int[]num= new int[size];
        for(int i=0; i<size; i++){
       num[i]= sc.nextInt();
        }

        for( int i= num.length-1; i>=0; i--){
            
System.out.println("here is reverse element " + num[i]);
        }
    }
}
