
import java.util.Scanner;

public class evenprint {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int number= s.nextInt();
        
        for(int i=0; i<number; i++){
            if(i%2==0){
                System.out.println(i);
        }
        }
    }
    
    
}
