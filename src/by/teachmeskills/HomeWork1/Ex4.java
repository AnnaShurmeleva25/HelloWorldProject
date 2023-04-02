package by.teachmeskills.HomeWork1;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Random newRandom = new Random();
        int randomNumber = newRandom.nextInt(51) + 1;
        System.out.println("Введите число от 1 до 50:");
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = scanner.nextInt();

        if (scannerNumber > randomNumber || scannerNumber < randomNumber) {
            for (int i = 7; i > 0; --i) {
                if (scannerNumber > randomNumber) {
                    System.out.println("Ваше число больше загаданного Осталось попыток: " + i );
                    Scanner newscannerT = new Scanner(System.in);
                    int scannerttwo = newscannerT.nextInt();
                    scannerNumber = scannerttwo;
                }
                else if (scannerNumber < randomNumber) {
                    System.out.println("Ваше число Меньше загаданного. Осталос попыток " + i);
                    Scanner newscnnaerThr = new Scanner(System.in);
                    int newScannerThree = newscnnaerThr.nextInt();
                    scannerNumber = newScannerThree;
                }
            }
            if (scannerNumber == randomNumber) {
                System.out.println("Вы выиграли!");
            }
        }
        if (scannerNumber > randomNumber || scannerNumber < randomNumber) {
            System.out.println("Вы проиграли!");
        }
    }
}
