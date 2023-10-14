package dz_4;

public class Task2 {
    public static void main(String[] args) {
        Clothes[] mas = {
                new TShirt(size.XS, 2500, "Red"),
                new Pants(size.L, 2700, "Black"),
                new Tie(size.L, 650, "Grey"),
                new Skirt(size.S, 1700, "Yellow")
        };

        Atelier.dressWoman(mas);
        Atelier.dressMan(mas);
    }
}


interface ManClothing {
    void dressMan();
}


interface WomanClothing {
    void dressWoman();
}


enum size {
    XXS(32, "Детский размер"),
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    final int euro_size;
    final String desc;

    size(int euro_size, String desc) {
        this.euro_size = euro_size;
        this.desc = desc;
    }
}


abstract class Clothes implements WomanClothing, ManClothing {
    size siz;
    int price;
    String color;

    public void dressWoman() { }
    public void dressMan() { }

    Clothes(size siz, int price, String color) {
        this.siz = siz;
        this.price = price;
        this.color = color;
    }
}


class TShirt extends Clothes implements ManClothing, WomanClothing {
    TShirt(size siz, int price, String color) {
        super(siz, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.printf("Женщина надела футболку стоимостью %d, %s цвета, %s размера\n", price, color, siz);
    }

    @Override
    public void dressMan() {
        System.out.printf("Мужчина надел футболку стоимостью %d, %s цвета, %s размера\n", price, color, siz);
    }
}


class Pants extends Clothes implements ManClothing, WomanClothing {
    Pants(size siz, int price, String color) {
        super(siz, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.printf("Женщина надела штаны стоимостью %d, %s цвета, %s размера\n", price, color, siz);
    }

    @Override
    public void dressMan() {
        System.out.printf("Мужчина надел штаны стоимостью %d, %s цвета, %s размера\n", price, color, siz);
    }
}


class Skirt extends Clothes implements WomanClothing {
    Skirt(size siz, int price, String color) {
        super(siz, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.printf("Женщина надела юбку стоимостью %d, %s цвета, %s размера\n", price, color, siz);
    }
}


class Tie extends Clothes implements ManClothing {
    Tie(size siz, int price, String color) {
        super(siz, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Мужчина надел галстук стоимостью %d, %s цвета, %s размера\n", price, color, siz);
    }
}


class Atelier {
    public static void dressWoman(WomanClothing[] mas) {
        for (WomanClothing i: mas) {
            i.dressWoman();
        }
    }

    public static void dressMan(ManClothing[] mas) {
        for (ManClothing i: mas) {
            i.dressMan();
        }
    }
}

