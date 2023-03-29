package by.shurmeleva.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + random.nextInt(5);
        }
        System.out.println(sum);

        extracted();
    }

    private static void extracted() {
        System.out.println("What is you name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}

