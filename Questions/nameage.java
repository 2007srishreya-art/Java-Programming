
import java.util.Scanner;

public class nameage {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age and your name");
        int age= s.nextInt();
        String name= s.nextLine();
        System.out.println(" my name is "+ name +" and i am "+ age +" year old");
        
        
    }
    
}
