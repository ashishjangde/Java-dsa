package practice;

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Odd");

        }else {
            System.out.println("Even");
        }
    }
}
