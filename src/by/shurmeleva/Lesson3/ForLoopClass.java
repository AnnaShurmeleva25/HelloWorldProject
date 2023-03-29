package by.shurmeleva.Lesson3;

public class ForLoopClass {
    public static void main(String[] args) {

        for (int counter = 0; counter < 100; counter++) {
            System.out.println("aaaa" + counter);

        }
        for (int i = 0; i < 100; i++) { // вывести четные числа
            if (i % 2 == 0) {
                System.out.println(i);
            }
//            for (int i = 0; i < 1000; i += 2) {
//                System.out.println(i);
//            }
//            for (int i = 0; i < 50; i++) {
//                System.out.println(2 * i);
            }
            int count = 100;
            while (count > 0) {
                System.out.println("count: " + count--);
            }
            do {
                System.out.println("count again: " + count++);
            } while (count < 100);
        }
//        int count = 100;
//        while (count > 0) {
//            System.out.println("count: " + count);
//            count -= 2;
//        }
//        do {
//            System.out.println("count again: " + count);
//            count += 2;
//        } while (count < 100);

    }

//}





