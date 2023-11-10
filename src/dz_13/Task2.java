package dz_13;

public class Task2 {
    public static void main(String[] args) {
        Person person1 = new Person("Петров", "Василий", "Васильевич");
        Person person2 = new Person("Петров");

        System.out.println(person1.get_fio() + '\n' + person2.get_fio());
    }
}


class Person {
    private String first_name;
    private String last_name;
    private String middle_name;

    Person(String lastName) {
        last_name = lastName;
    }

    Person(String first_name, String lastName) {
        last_name = lastName;
        this.first_name = first_name;
    }

    Person(String first_name, String lastName, String middle_name) {
        last_name = lastName;
        this.first_name = first_name;
        this.middle_name = middle_name;
    }

    public String get_fio() {
        String first = (this.first_name != null ? this.first_name.charAt(0) + "." : "");
        char middle = (this.middle_name != null ? this.middle_name.charAt(0) : ' ');
        return this.last_name + " " + first + middle;
    }
}