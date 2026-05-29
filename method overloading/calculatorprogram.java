
import java.util.Scanner;

public class calculatorprogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for addition: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("enter number for multiplication: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        System.out.println("enter number for division: ");
        double no1 = sc.nextDouble();
        double no2 = sc.nextDouble();
        System.out.println("here is your output: " + simplification(number1, number2) +" " + simplification(num1, num2, num3)  +" " + simplification(no1, no2)
        );
        
        simplification(number1, number2);
        simplification(num1, num2, num3);
        simplification(no1, no2);

    }

    static int simplification(int num1, int num2) {
        return (num1 + num2);
    }

    static float simplification(float a, float b, float c) {
        return (a * b * c);
    }

    static double simplification(double p, double q) {
        return (p / q);
    }

}
