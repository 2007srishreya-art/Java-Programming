
import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("row: ");
        int row= sc.nextInt();
        System.out.println("column: ");
        int column= sc.nextInt();

        //outer loop
        for(int i=1; i<=row; i++){
            //iner loop
            for(int j=1; j<=column; j++){
                  System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}
