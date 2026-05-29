package array;

import java.util.Scanner;

public class duplicatesnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("enter your elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("here is your duplicated number: ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }

            }

        }
        System.out.println("enter fequency number: ");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }

        }
        System.out.println("fequency number is " + count);

    }
}
