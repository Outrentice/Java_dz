package dz_2;

import java.util.Arrays;


class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int convert_age() {
        return this.age * 7;
    }

    public String toString() {
        return "Собаке с кличкой " + this.name + " " + this.age + " лет";
    }

    public static String toString(Object o) {
        return "fa";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class DogKennel {
    private Dog[] kennel = new Dog[2];
    private int kennel_length = 0;
    public Dog[] getKennel() {
        return Arrays.copyOf(kennel, kennel_length);
    }

    private void expansion_array() {
        kennel = new Dog[kennel.length * 2];
        System.arraycopy(getKennel(), 0, kennel, 0, kennel_length);
    }

    public void addDog(Dog[] dogs) {
        for (Dog item: dogs) {
            kennel[kennel_length] = item;
            kennel_length++;

            if (kennel_length == kennel.length) {
                expansion_array();
            }
        }
    }


}