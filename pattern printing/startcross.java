
import java.util.Scanner;

public class startcross {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("row : ");
        int row= sc.nextInt();
        System.out.println("column : ");
        int column= sc.nextInt();

        //outer loop
        for(int i=1; i<=row; i++){
            //inner loop
            for(int j=1; j<=column; j++){

                if(i==j || i+j==row+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
        
            }
            System.out.println();
        }
    }
    
}
