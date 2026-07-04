
import java.util.Scanner;

public class printing_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("row ?");
        int row= sc.nextInt();
        System.out.println("column ?");
        int column= sc.nextInt();
        //outer loop
        for(int i=1; i<row; i++){
            //inner loop
            for(int j=1; j<column; j++){
                if(i%2==0){
                   System.out.print((char)+ (64+i) + " ");
                }else{
                    System.out.print((char)+ (96+i)+ " ");
                }

            }
            System.out.println();
        }
    }
    
}
