package dz_6;

public class Task3 {
    public static void main(String[] args) {
        Nameable[] mas = {new Car("Volvo"), new Animal("Dog"), new Planet("Earth")};

        for (Nameable item: mas)
            System.out.println(item.getName());
    }
}


interface Nameable {
    String getName();
}


class Planet implements Nameable {
    private String name;

    Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Car implements Nameable {
    private String name;

    Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Animal implements Nameable {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

