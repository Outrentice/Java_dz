package dz_4_1;

public class Task2 {
    public static void main(String[] args) {
        Phone[] Phones = {
                new Phone("Xiaomi", "+79464127558", 255.8),
                new Phone("Iphone", "+79124900382"),
                new Phone("Samsung", "+7905991950", 372)
        };

        for (Phone item: Phones) {
            System.out.println(item.getModel() + " " + item.getNumber() + " " + item.getWeight());
            item.receiveCall("Андрей");
            item.receiveCall("Андрей", Phones[1].getNumber());
        }

        Phones[0].sendMessage(new String[] {Phones[1].getNumber(), Phones[2].getNumber()});
    }
}


class Phone {
    private String model;
    private String number;
    private double weight;

    Phone(String model, String number, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    Phone() { }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " - " + number);
    }

    public void sendMessage(String[] numbers) {
        for (String item: numbers)
            System.out.println(item);
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
}
