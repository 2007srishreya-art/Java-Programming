package array;

import java.util.Scanner;

public class countevenodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int size= sc.nextInt();
        // create array
        int [] arr= new int[size];
        System.out.println("enter your  elements");
         for (int i = 0; i < size; i++) {
          arr[i] = sc.nextInt();
          
         }
         int count=0;
        
         for(int i=0; i<arr.length; i++){

            if(arr[i]%2==0){
                 count= count+1;
         System.out.println("this is even number" + arr[i]);
            }
            else{
                System.out.println("this is odd number" + arr[i]);
            }
         }
         System.out.println(count);
        }
        
}


