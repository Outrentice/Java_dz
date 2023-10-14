package dz_1;

public class Task6 {
    public static void main(String[] args) {
        for (int i=1; i <= 10; i++)
            System.out.println("Число " + i + ": " + String.format("%.3f", 1. / i));
    }
}
