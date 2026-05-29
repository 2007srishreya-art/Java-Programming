
import java.util.Scanner;

public class vechiletest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for vehicle");
        int choice = sc.nextInt();

        drivingchoice d = new drivingchoice();
        bike b = new bike();
        car c = new car();

        if (choice == 1) {
            d.vechile();
        } else if (choice == 2) {
            b.vechile();
        } else if (choice == 3) {
            c.vechile();
        } else {
            System.out.println("nothing");
        }
    }

    class drivingchoice {

        void vechile() {
            System.out.println("vechile is best for riding");
        }
    }

    class bike extends drivingchoice {

        void vechile() {
            System.out.println("bike is best for long tour");
        }
    }

    class car extends drivingchoice {

        void vechile() {
            System.out.println("car is more comfortable then any other vechile");
        }
    }
}
