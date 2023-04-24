package by.shurmeleva.Lesson7;

public class Laptop extends Comp{

    public Laptop(String hdd, String ram, String touchpad) {
        super(hdd, ram); // super - конструктор класса родителя
        this.touchpad = touchpad;
        this.username = "Pasha";
    }

    private String touchpad;


    public String getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(String touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public void printDisplay() {

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "touchpad='" + touchpad + '\'' +
                "} " + super.toString();

    }
}
