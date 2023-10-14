package dz_6;

public class Task4 {
    public static void main(String[] args) {
        Priceable[] mas = {new TV(410250), new TShirt(2450), new Pants(2999.99)};

        for (Priceable item: mas)
            System.out.println(item.getPrice());
    }
}


interface Priceable {
    double getPrice();
}


class TShirt implements Priceable {
    private double price;

    TShirt(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

class Pants implements Priceable {
    private double price;

    Pants(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

class TV implements Priceable {
    private double price;

    TV(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

