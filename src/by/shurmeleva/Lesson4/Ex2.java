package by.shurmeleva.Lesson4;

public class Ex2 {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr2 = new int[5];
//        int[] arr3 = new int[10];
//        System.out.println("third element: " + arr[2]);
//        System.out.println("third element: " + arr2[2]);
////        //arr2[2] = 10;
//        System.out.println("third element: " + arr2[2]);
//        System.out.println("Arr length: " + arr.length);
//        Random random = new Random();
//
////        for (int i = 0; i < arr2.length; i++)  {
////            arr2[i] = random.nextInt(10);
//        //System.out.println("arr2[" + i +"] = " + arr2[i]);
//        System.out.println("third element: " + arr[2]);
//        System.out.println("third element: " + arr2[2]);
//        System.out.println("third element: " + arr3[2]);
//
//
//
////        for (int i = 0; i < arr3.length; i++) {
////            arr3[i] = arr [i + 1];
//
//            //System.out.println("arr3[" + i +"] = " + arr3[i]);
////            System.out.println(Arrays.toString(arr2));
//            System.out.println(arr2);// место в памяти массива
//
//            int sum = 0;
//            for (int val: arr2) {
//                System.out.println(val);
//                sum += val;
//            }
//            System.out.println(Arrays.toString(arr2));
//            System.out.println(sum);
//            Arrays.sort(arr2, 2, 5);// когда сортируем не весь массив
//            Arrays.sort(arr2);// когда сортируем  весь массив
//            System.out.println(Arrays.toString(arr2));

//            int result = -1;
//            //допустим arr2[0] = 3;
//            //result < arr2[0] - значит result = arr2[0]
//            for (int i = 0; i < arr2.length; i++)  {
//                arr2[i] = random.nextInt(10);

        int[] intArray = {12, 2, 3, 99, 5, 8, 10};

        int max = intArray[0];
        int min = intArray[1];
        int countOfTwo = 0;

        for (int a : intArray) {
            if (a > max)
                max = a;
            if (a == 2) {
                countOfTwo = countOfTwo + 1;
            }
        }
        for (int b : intArray) {
            if (b < min)
                min = b;
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        System.out.println(countOfTwo);
    }
}





