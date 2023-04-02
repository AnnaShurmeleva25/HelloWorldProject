package by.teachmeskills.HomeWork1;


import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;


        for (int i = 1; i <= a; i++) {
            if (a <= 100) {
                sum = sum + i;
                System.out.println(sum);
            } else {
                System.out.println("Человек неправ");
                break;
            }
        }
    }
}
