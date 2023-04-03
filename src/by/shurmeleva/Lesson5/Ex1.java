package by.shurmeleva.Lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[][] arr2 = new int[10][10];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i * j;
            }
        }
        System.out.println(Arrays.deepToString(arr2));

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(" arr[i][j] = " + arr2[i][j]);
            }
            System.out.println();
        }

        int[][] arr3 = new int[4][];

        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i + 1];
            Arrays.fill(arr3[i], i + 1);
        }
        System.out.println(Arrays.deepToString(arr3));


        int[][] arr4 = new int[5][5];
        Random random = new Random();
        System.out.println(Arrays.toString(arr4));
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                arr4[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.deepToString(arr4));
        }

    }
}
