package dz_3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Employee[] em1 = {
                new Employee("Max", 1500.14523),
                new Employee("Maxim", 20.234),
                new Employee("Irina", 140),
                new Employee("Andrey", 59.91),
        };

        for (int i=0; i < em1.length; i++) {
            Report.generateReport(em1[i].getFullname(), em1[i].getSalary());
        }
    }
}


class Employee {
    private String fullname;
    private double salary;


    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Report {
    public static void generateReport(String name, double salary) {
        char[] spacesArray = new char[15 - name.length() - Integer.toString((int) salary).length() + 3];
        Arrays.fill(spacesArray, ' ');
        String spaces = new String(spacesArray);
        System.out.printf("У сотрудника с именем %s зарпалата:%s%.2f\n", name, spaces, salary);
    }
}