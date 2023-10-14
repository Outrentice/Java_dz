package dz_4_1;

public class Task1 {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(2, 4), new Square(2)};

        for (Shape item: shapes) {
            System.out.println(item.getArea());
            System.out.println(item.getPerimeter());
            System.out.println(item.getType());
            System.out.println(item.toString() + '\n');
        }
    }
}


class Shape {
    public String getType() {
        return "Фигура";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}


class Circle extends Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }


    @Override
    public String toString() {
        return "Круг с радиусом " + r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public String getType() {
        return "Круг";
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}


class Rectangle extends Shape {
    private double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public String toString() {
        return "Прямоугольник со сторонами " + a + " и " + b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}


class Square extends Shape {
    private double a;

    Square(double a) {
        this.a = a;
    }


    @Override
    public String toString() {
        return "Квадрат со стороной " + a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }

    @Override
    public String getType() {
        return "Квадрат";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}


