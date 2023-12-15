package dz_8;

public class Task2 {
    public static void main(String[] args) {
        Sequence(7);
    }

    public static int Sequence(int n) {
        if (n == 0)
            return 1;

        System.out.print(Sequence(n - 1));
        return n + 1;
    }
}
