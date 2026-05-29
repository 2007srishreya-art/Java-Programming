package array;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size: ");
        int size= sc.nextInt();
        int[]arr= new int[size];

        System.out.println("enter your elements: ");
        int count=0;
        
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
             
        }
        System.out.println("enter your frequency number: ");
        int num= sc.nextInt();
       
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println("here is your frequency number " + count);
    }
    
} 

        
            
    
    

