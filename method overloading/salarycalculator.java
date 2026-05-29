
import java.util.Scanner;

public class salarycalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter salary: ");
        int payment = sc.nextInt();
        salary(payment);

        System.out.println("enter bonus: ");
        int extra = sc.nextInt();
        salary(payment, extra);

        System.out.println("enter overtime: ");
        int overtime = sc.nextInt();
        System.out.println("Hlww i'm MOhan i'm working in Amazon and this is the detail of my Salary, my Bonus and what I pay for my overtime " + salary(payment, extra, overtime));
        salary(payment, extra, overtime);

    }

    static int salary(int payment) {
        return (payment);

    }

    static int salary(int payment, int bonus) {
        return (payment + bonus);
    }

    static int salary(int payment, int bonus, int overtime) {
        return (payment + bonus + overtime);
    }

}
