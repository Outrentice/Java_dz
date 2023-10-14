package dz_6;

public class Task6 {
    public static void main(String[] args) {
        Printable[] mas = {new Book(190, "Хамелеон", "Чехов"), new Shop("Zara")};

        for (Printable item: mas)
            item.print();
    }
}


interface Printable {
    void print();
}


class Book implements Printable {
    private double price;
    private String name;
    private String author;

    Book(double price, String name, String author) {
        this.price = price;
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + name + ", написанная автором \"" + author + "\"" + ", по цене " + price);
    }
}

class Shop implements Printable {
    private String name;

    Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Магазин " + name);
    }
}