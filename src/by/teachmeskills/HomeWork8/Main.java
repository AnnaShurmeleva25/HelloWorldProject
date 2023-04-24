package by.teachmeskills.HomeWork8;

public class Main {
    public static void main(String[] args) {

        Phone myPhone = new Phone("375445000000", "Apple", 6.8);


        myPhone.setModel("Apple");
        myPhone.setNumber("375445000000");
        myPhone.setWeight(6.8);

        System.out.println(myPhone.getNumber());
        System.out.println(myPhone.getModel());
        System.out.println(myPhone.getWeight());

        myPhone.receiveCall("Mam");
        myPhone.receiveCall("Dad");
        myPhone.receiveCall("Friend", "375447888888");

        myPhone.sendMessage("Message", "34", "56", "78");
        myPhone.sendMessage("Message2", "34");


    }
}
