package by.shurmeleva.Lesson6;

public class MainClass {
    public static void main(String[] args) {
        Car myBmw = new Car();
//        myBmw.colour = "Green";
//        myBmw.age = 2023;
//        myBmw.brand = "BMW";
//        System.out.println(myBmw.colour);
//        System.out.println(myBmw.wheelNumber);
//        System.out.println(myBmw.brand);
//        System.out.println(myBmw.age);

        Car myBestBMW = new Car("Blue", 2023, "BMW", 4, true, "Auto");
        System.out.println(myBestBMW.getColour());
        myBestBMW.setColour("Black-Metal");
        System.out.println(myBestBMW.getColour());
        System.out.println(myBestBMW);

        myBestBMW.startDriving();// завелись
        myBestBMW.changeSpeed(10);// добавили скорость
        myBestBMW.goDirectly();//поехали прямо
        myBestBMW.changeSpeed(50);//добавили скорость
        myBestBMW.changeSpeed(-30);//снизили скорость перед светофором
        myBestBMW.switchDirection(true);//повернули направо
        myBestBMW.goDirectly();//едем прямо
        myBestBMW.changeSpeed(30);//добавили скорость
        myBestBMW.sound();// посигналили
        myBestBMW.changeSpeed(-60);//затормозили

//        sum(1);
//        sum(1,2,3);

    }
//    private static void sum(int random, int ... numbers) {
//        int sum = 0;
//        for (int val: numbers) {
//            sum += val;
//        }
//        System.out.println("Sum sum: " + sum);
    }
//}

