package array;

import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        // take array size
        System.out.println("enter array size: ");
        int size= s.nextInt();
        // take array elements from user
        System.out.println("enter your element: ");
        int[]num= new int[size];
        // create a container
        int sum=0;
        for(int i=0; i<num.length; i++){
            num[i]= s.nextInt();
            sum= sum+num[i];

        }
        // print sum of all elements
        System.out.print("here is your sum:  " + sum);
        }
       
}

