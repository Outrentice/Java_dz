package dz_1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        System.out.println("Факториал = " + fact(scan.nextInt()));

    }

    static int fact(int number) {
        int fact = 1;
        for (int i=2; i <= number; i++)
            fact *= i;
        return fact;
    }
}
