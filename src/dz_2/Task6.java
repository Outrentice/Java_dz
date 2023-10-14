package dz_2;

import java.sql.SQLOutput;

public class Task6 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1, 2, 3);
        Circle circle2 = new Circle(1, 2, 3);
        Circle circle3 = new Circle(1, 2, 2);

        System.out.println("Длина первой окружности: " + circle1.get_length());
        System.out.println("Площадь первой окружности: " + circle1.get_square());
        System.out.println("Результат сравнения первой окружности со второй: " + circle1.equals(circle2));
        System.out.println("Результат сравнения первой окружности с третьей: " + circle1.equals(circle3));
    }
}


class Circle {
    private double center_x;
    private double center_y;
    private double radius;

    Circle(double centerX, double centerY, double radius) {
        center_x = centerX;
        center_y = centerY;
        this.radius = radius;
    }

    public double get_square() {
        return Math.PI * Math.pow(radius, 2);

    }

    public double get_length() {
        return 2 * Math.PI * radius;
    }

    public boolean equals(Object obj) {
        Circle other = (Circle) obj;
        return this.center_x == other.center_x &&
                this.center_y == other.center_y &&
                this.radius == other.radius;
    }

    public double getCenter_x() {
        return center_x;
    }

    public void setCenter_x(double center_x) {
        this.center_x = center_x;
    }

    public double getCenter_y() {
        return center_y;
    }

    public void setCenter_y(double center_y) {
        this.center_y = center_y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}