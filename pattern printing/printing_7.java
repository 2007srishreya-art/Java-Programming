 
import java.util.Scanner;

public class printing_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("row ?");
        int row= sc.nextInt();
       
        //outer loop
        for(int i=1; i<=row; i++){

            //inner loop
            for(int j=1; j<=i; j++){
                if(i%2==0){
                    System.out.print((char)+ (j+64)+ " ");
                }else{
                    System.out.print(j + " ");
                    

                }
                

            }
            System.out.println();
        }
    }
    
}
