package conditions;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks: ");
        int num= sc.nextInt();
        if(num>=90){
            System.out.println("Excellent");
        }else if (num>=80) {
            System.out.println("very good");
        }
        
        else if(num>=70){
            System.out.println("Good");
        }
        else if(num>=60){
            System.out.println("Average");
        }
        else if(num>=50){
            System.out.println("Below Average");
        }
        else{
            System.out.println("Fail");
        }

    }
    
}
