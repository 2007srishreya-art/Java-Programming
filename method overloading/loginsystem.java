
import java.util.Scanner;

public class loginsystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter you Email i'd: ");
        String email= sc.nextLine();
        System.out.println("enter your phone number: ");
        long number= sc.nextLong();
        sc.nextLine();
        System.out.println("enter your password: ");
        String pass= sc.nextLine();
        System.out.println("here is your login information: "+" your email: " +  details(email) +" your phone number: " + details(number) +"your password: " +  details(pass) );
        details(email);
        details(number);
        details(pass);
    }
    static String details(String email){
           return(email);
    }
    

    static long details(long phone_number){
            return(phone_number);
    }
    

    static String details(String email, String Password){
             return(email + Password);

    }

}


