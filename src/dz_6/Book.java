package dz_6;

public class Book implements Printable {
    private double price;
    private String name;
    private String author;

    public Book(double price, String name, String author) {
        this.price = price;
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + name + ", написанная автором \"" + author + "\"" + ", по цене " + price);
    }
}
