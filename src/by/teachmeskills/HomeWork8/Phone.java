package by.teachmeskills.HomeWork8;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    Phone (){
    }
    void receiveCall (String name) {
        System.out.println("Calling" + name);
    }
    void receiveCall (String name, String number) {
        System.out.println(name + "with number" + number + "is calling on my phone number" + getNumber());
    }
    void sendMessage (String message, String... numbers) {
        System.out.println("Sending message " + message + "to phones: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

