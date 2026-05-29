package array;

import java.util.Scanner;

public class printelement {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // declaring array size
        System.out.println("enter your array size: ");
        int size = s.nextInt();
        //create an array
        int[] num = new int[size];
        // take input from user in array
        System.out.println("enter your all element: ");
        for (int i = 0; i < size; i++) {
            num[i] = s.nextInt();

        }
        // print all elements 
        System.out.println("here is your element:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
