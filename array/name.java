package array;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
//         Scanner s= new Scanner(System.in);
//         System.out.println("enter your array size: ");
//         int size= s.nextInt();
//         char[] mohan= new char[size];
//         System.out.println("enter your charcter: ");
//       for (int i = 0; i < size; i++) {
// mohan[i]= s.next().charAt(0);
//       }
//       System.out.println("your name is: ");
//       for(int i=0; i<mohan.length; i++){
//         System.out.print(mohan[i]);
//       }
//     }
        
    
Scanner s= new Scanner(System.in);
System.out.println("enter your array size: ");
int size= s.nextInt();
char[]raghav= new char[size];
for (int i=0; i<size; i++){
    raghav[i]= s.next().charAt(0);
    
}
for(int i=0; i<raghav.length; i++){
    System.out.print(raghav[i]);
}
}
    }

    

