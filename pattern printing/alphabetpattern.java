
import java.util.Scanner;

public class alphabetpattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter last alphabet: ");
        char alphabet= sc.next(). charAt(0);

        //outer loop
        for(int i=1; i<=alphabet; i++){
            //inner loop
            for(int j=1; j<=alphabet; j++){
                System.out.println(j + " ");
            }
            System.out.println();

        }
    }
    
}
