
import java.util.Scanner;

public class pattern_9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("row : ");
        int row= sc.nextInt();
        System.out.print("column : ");
        int column= sc.nextInt();

        //outer loop
        for(int i=1; i<=row; i++){

            //inner loop
            for(int j=1; j<=column; j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print("* ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    
}
