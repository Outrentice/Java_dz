package dz_3;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int len = ThreadLocalRandom.current().nextInt(1, 100);
        boolean Math_rand = rand.nextBoolean();
        double[] mas = new double[len];

        if (!Math_rand) {
            System.out.println("С помощью Random");
            for (int i = 0; i < len; i++) {
                mas[i] = rand.nextDouble() * 10;
            }
        }
        else {
            System.out.println("С помощью Math");
            for (int i = 0; i < len; i++) {
                mas[i] = Math.random() * 10;
            }
        }
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
    }
}
