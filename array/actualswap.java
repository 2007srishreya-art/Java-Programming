package array;

import java.util.Scanner;

public class actualswap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size: ");
        int size= sc.nextInt();

        System.out.println("enter elements: ");
        int[]arr= new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
            
        }
        System.out.println("swaping number is: ");
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
           arr[start]=arr[end];
           arr[end]= temp;
             start++;
             end--;
        }
        for(int j:arr){
         System.out.println(j);
        }
    }
    }
    

