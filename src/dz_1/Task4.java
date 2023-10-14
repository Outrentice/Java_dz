package dz_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int mas_len = scan.nextInt();
        int[] mas = new int[mas_len];

        int i = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (i < mas_len) {
            System.out.print("Введите элемент массива: ");
            mas[i] = scan.nextInt();

            sum += mas[i];
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }

            i++;
        }

        System.out.println("Sum: " + sum + "\nmax: " + max + "\nmin: " + min);
    }
}
