package by.shurmeleva.Lesson7;

public class LessonMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("a", "b", "c");
        laptop.setHdd("10");
        PC pc = new PC("a", "b");
        pc.setHdd("20");

        //Comp comp = new Comp("a", "b");
        Comp myBestComputer = new Laptop("c", "d", "e");
        System.out.println(myBestComputer);
        if (myBestComputer.getHdd() == "100") {
            System.out.println("ogogo");
        } else {
            System.out.println("fooo");
        }
        Airplane plane = new Airplane();
        plane.fly();
        plane.flyWithSound();
        plane.printMessage();

        Duck duck = new Duck();
        duck.fly();
        duck.flyWithSound();
        duck.printMessage();
        Duck[] ducks = new Duck[3];
        Airplane[] airplanes = new Airplane[3];

        Object obj = new Airplane();
        Object obj2 = new Duck();

        if (obj instanceof Airplane) {
            ((Airplane) obj).fly();
        }else if (obj instanceof Duck) {
            ((Duck) obj).fly();
        }

        //if (plane instanceof Airplane) { // если бы не было интерфейса, код записывался бы так
          //  ((Airplane)plane).fly();
       // }else if (plane instanceof Duck) {
          //  ((Duck) plane).fly();
       // }

        Flyable[] flyingItems = getFlyingItems();
        for (Flyable flyable: flyingItems) {
            flyable.flyWithSound();
        }
    }

    private static Flyable[] getFlyingItems() {
        Flyable[] flyingItems = new Flyable[4];
        flyingItems[0] = new Duck();
        flyingItems[1] = new Airplane();
        flyingItems[2] = new Duck();
        flyingItems[3] = new Airplane();
        return flyingItems;
    }
}
