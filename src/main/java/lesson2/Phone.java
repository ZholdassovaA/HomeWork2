package lesson2;

public class Phone {
    String number;
    String model;
    int weight;

    public void receiveCall(String name) {
        System.out.println("Звонит" + name);
    }
}