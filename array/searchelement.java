package array;

import java.util.Scanner;

public class searchelement {
    public static void main(String[] args) {
        System.out.println("enter array size: ");
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();

        int[]arr= new int[size];

        System.out.println("enter your  number: ");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt(); 
        }
        boolean search= false;
        System.out.println("enter a specific number: ");
        int number= sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(number==arr[i]){
                search=true;
                break;
            }
        }
        if(search){
            System.out.println("found the number");
        }else{
            System.out.println("not found");
        }
    }

    }
    

