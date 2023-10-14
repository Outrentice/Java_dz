package dz_1;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[] {1, 2, 3, 4, 5};
        int sum = 0;

        for(int i: mas)
            sum += i;

        System.out.println(sum + " " + sum / mas.length);
    }
}