package dz_6;

public class Task6 {
    public static void main(String[] args) {
        Printable[] mas = {new Book(190, "Хамелеон", "Чехов"), new Shop("Zara")};

        for (Printable item: mas)
            item.print();
    }
}







