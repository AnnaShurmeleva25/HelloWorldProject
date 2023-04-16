package by.teachmeskills.HomeWork7;

public class MainJobTitle {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Director director = new Director();
        Accounter accounter = new Accounter();
        worker.printJob();
        director.printJob();
        accounter.printJob();
    }
}
