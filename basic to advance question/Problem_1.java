
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
    
       Scanner sc= new Scanner(System.in);
       System.out.println("how many students in your card? ");
       int number= sc.nextInt();
       sc.nextLine();
       System.out.println("enter your student name: ");
       String  student[]= new String[number];

       for(int i=0; i<number; i++){
        student[i]= sc.nextLine();

       }
       System.out.println("how many subject's in your class: ");
       int num= sc.nextInt();
       sc.nextLine();
       System.out.println("enter subject's name one by one: ");
       String subject[]= new String[num];

       for(int j=0; j<num; j++){
        subject[j]= sc.nextLine();
       }

       int[][] matrix= new int[number][num];
       System.out.println("enter your marks: ");
          //outer loop
          for(int i=0; i<number; i++){

            //inner loop
            for(int j=0; j<num; j++){
                matrix[i][j]= sc.nextInt();
            }
               sc.nextLine();

          }
              double avg=calculateaverage(matrix[1]);

    }
          static double calculateaverage(int[]average){
            int total= 0;
            for(int i=0; i<average.length; i++){
                total=total+average[i];

            }
            int calculatedmarks= total/average.length;
            return total;

          }


    
}
