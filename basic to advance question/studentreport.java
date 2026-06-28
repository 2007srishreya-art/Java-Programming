
import java.util.Scanner;


public class studentreport {
    public static double calculateAvrage(int science, int math, int hindi) {
        return avg();
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("enter Student: " + (i+1) + "Name");
            String name= sc.nextLine();

            System.out.println("enter science marks: ");
            int science= sc.nextInt();

            System.out.println("enter math marks: ");
            int math= sc.nextInt();

            System.out.println("enter hindi marks: ");
            int hindi= sc.nextInt();

        }
        
    }
        double avg= calculateAvrage( science,  math,  hindi);
   
}

