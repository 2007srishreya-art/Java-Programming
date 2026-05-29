import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter 1st number: ");
        int num1= sc.nextInt();
        System.out.print("enter 2nd number: ");
        int num2= sc.nextInt();
        System.out.print("here is your addition: ");
        add(num1,num2);

        System.out.print("enter 1st number: ");
        float number1=sc.nextFloat();
        System.out.print("enter 2nd number: ");
        float number2= sc.nextFloat();
        System.out.print("here is your float addition: ");
        add(number1,number2);

        System.out.print("enter 1st number: ");
        double no1=sc.nextDouble();
        System.out.print("enter 2nd number: ");
        double no2= sc.nextDouble();
        System.out.print("here is your double num addition: ");
        add(no1,no2);

    }
    static int add(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    static float  add(float a, float b, float c){
        System.out.println(a+b+c);
        return a+b+c;
    }
    static double add(double a, double b){
        System.out.println(a+b);
        return a+b;
    }
    
}
