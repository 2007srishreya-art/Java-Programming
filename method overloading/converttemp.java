
import java.util.Scanner;

public class converttemp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("enter Degree in fehrenheit: ");
        Float temp= sc.nextFloat();
        System.out.println("here is the converted fahrenheit " + convert(temp));
        

       
    }
    static float convert( float fahrenheit) {
        // float fahrenheit = (9 * celsius / 5) + 32;
        // return(fahrenheit);
        float celsius = (5 * (fahrenheit - 32)) / 9;
        return(celsius);

        
    }
    
}
