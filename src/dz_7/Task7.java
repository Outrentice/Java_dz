package dz_7;

import dz_6.Book;
import dz_6.Shop;

import dz_6.Printable;

public class Task7 {
    public static void main(String[] args) {
        Printable[] mas = {new Book(190, "Хамелеон", "Чехов"), new Shop("Zara")};
        Magazine.printMagazines(mas);
        printableBook.printBook(mas);
    }
}

class Magazine {
    public static void printMagazines(Printable[] printable) {
        for (Printable item: printable) {
            if (item instanceof Shop)
                item.print();
        }
    }
}


class printableBook {
    public static void printBook(Printable[] printable) {
        for (Printable item: printable) {
            if (item instanceof Book)
                item.print();
        }
    }
}

