import java.util.Scanner;
public class area {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("enter side: ");
       int num= sc.nextInt();
       System.out.println("area of square is: "+ square(num) );
       square(num);

       System.out.print("enter length: ");
       int length= sc.nextInt();
       System.out.print("enter width: ");
       int width=sc.nextInt();
       System.out.println("rectangle area is: " + rectangle(length,width));
       rectangle(length, width);

       System.out.print("enter side: ");
       int num1=sc.nextInt();
       System.out.println("volume of cube is: " + cube(num1));
       cube(num1);

    }
    //area of square
    static int square(int side){
return side*side;
    }
    //area of rectangle
    static int rectangle(int length, int width){
        return length* width;
    }
    // //volume of cube
    static int cube(int a){
        return a*a*a;
    }
    
}
