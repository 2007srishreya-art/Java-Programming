
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("pehla number daliye: ");
        int a= sc.nextInt();
        System.out.println("dushra vi daliye bhai .. tb n power hoga");
        int b= sc.nextInt();
        int power=1;
        for(int i=0; i<b; i++){
          power= power*a;
        }
        System.out.println("ye lijiye apna power wala number : " + power);

    }
    
}
