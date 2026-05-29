package array;
import java.util.Scanner;
public class missingnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size: ");
        int size= sc.nextInt();
        int sum=0;
        int sum2=0;
        int missingnum=0;
 System.out.println("enter your elements: ");
        int[]arr= new int [size];
        for (int i =0;  i < size; i++){
        
            arr[i]= sc.nextInt();
        }
       System.out.println("here is your missing elements: ");
        for(int i=0; i<arr.length; i++){
 sum=(size+1)*(size+2)/2;
        sum2= sum2+arr[i];
        
        }
        missingnum= sum-sum2;
       System.out.println(missingnum);

    }

    
}
