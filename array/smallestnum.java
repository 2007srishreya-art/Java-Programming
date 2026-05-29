package array;

import java.util.Scanner;

public class smallestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your array size: ");
        int size= sc.nextInt();

        int[]arr= new int[size];
        System.out.println("enter your elements: ");
        int min= 0 ;

        for(int i=0; i<size; ++i){
            arr[i]= sc.nextInt();

        }
        for(int i=0; i<arr.length; i++){
         if(min<arr[i]){
            arr[i]= min;
         }
        }
        System.out.println("here is your smallest number " + min);
        }
    }
    

