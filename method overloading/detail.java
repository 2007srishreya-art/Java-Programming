import java.util.Scanner;
public class detail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter student name: ");
        String name= sc.nextLine();
        System.out.println("enter student course: ");
        String course= sc.nextLine();
        System.out.println(student (name,course));

    }
    static String student(String name, String course){
        return"student name is "+ name + " and he is doing " + course;

    }
    
}
