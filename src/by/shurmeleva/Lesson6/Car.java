package by.shurmeleva.Lesson6;

public class Car {

        private String colour;
        private int age;
        private String brand;
        private int wheelNumber = 4;
        private boolean isRadioPresent = true;

        String korobka = "Auto";
    {
        age = 2022; //блок кода
    }
        private int currentSpeed = 0;
        //признаки
        //цвет авто,год авто, марка
        // колич колес, двигат, кузов
        //есть ли магнитола, коробка передач

    public Car(String colour, int age, String brand, int wheelNumber, boolean isRadioPresent, String korobka) {
            this.colour = colour;
            this.age = age;
            this.brand = brand;
            this.wheelNumber = wheelNumber;
            this.isRadioPresent = isRadioPresent;
            this.korobka = korobka;
        }

    public Car() {
        }

    @Override
    public String toString() {
        return "This is my best car - look at it: {" +
                "colour='" + colour + '\'' +
                ", age=" + age +
                ", brand='" + brand + '\'' +
                ", wheelNumber=" + wheelNumber +
                ", isRadioPresent=" + isRadioPresent +
                ", korobka='" + korobka + '\'' +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public boolean isRadioPresent() {
        return isRadioPresent;
    }

    public void setRadioPresent(boolean radioPresent) {
        isRadioPresent = radioPresent;
    }

    public String getKorobka() {
        return korobka;
    }

    public void setKorobka(String korobka) {
        this.korobka = korobka;
    }

    public void startDriving() {
        System.out.println("woof - woof"); //действие авто
    }
    public void sound() {
        System.out.println("bee - beep!!!");
    }
    public void goDirectly() {
        System.out.println("my car is going!!!");
    }
    public void switchDirection(boolean isRightOne) {
        if (currentSpeed > 30) {
            System.out.println("it is too dangerous to switch direction");
            return;
        }
        if (isRightOne) {
            System.out.println("we are moving to right direction");
        } else {
            System.out.println("we are moving to left direction");
        }
    }
        public void changeSpeed(int speedChange) {
        currentSpeed = currentSpeed + speedChange;
            if (speedChange > 0) {
                System.out.println("we are moving faster, our speed is " + currentSpeed);
            }else {
                System.out.println("we are moving slower, our speed is " + currentSpeed);
            }
            if (currentSpeed <= 0) {
                System.out.println("we finished our best trip!");
            }
            }

    public Car(String colour, int age, String brand) {
        this.colour = colour;
        this.age = age;
        this.brand = brand;
    }
    // действия, методы - завестись, подать сигнал
    // повернуть (вправо, влево)
    }

