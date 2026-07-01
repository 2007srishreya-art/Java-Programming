
import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter row: ");
        int row=sc.nextInt();
        System.out.print("enter column: ");
        int column=sc.nextInt();

        //outer loop
        for(int i=1; i<=row; i++){
            //inner loop
            for(int j=1; j<=column; j++){
                System.out.print((char) (j+96)+ " ");

            }
            System.out.println();
            
        }
    }
}
