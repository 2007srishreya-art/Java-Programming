
import java.util.Scanner;

public class printing_8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("row? ");
        int row= sc.nextInt();
//         //outer loop
//         for(int i=1; i<=row; i++){
            
//             //inner loop
//             for(int j=1; j<=row+1-i; j++){
//                 System.out.print("*" + " ");
//             }
// System.out.println();
//         }
        
// question(9)
//            a b c d
//            a b c
//            a b
//            a
      //outer loop
      for(int i=1; i<=row; i++){

        //inner loop
        for(int j=1; j<=row+1-i; j++){
            System.out.print((char)+ (96+j)+ " ");
        }
        System.out.println();
      }

    }
    
}
