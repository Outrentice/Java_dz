package dz_8;

public class Task1 {
    public static void main(String[] args) {
        TriangleSequence(7);
    }

    public static int TriangleSequence(int n) {
        if (n == 0)
            return 1;

        System.out.print(Integer.toString(TriangleSequence(n - 1)).repeat(n));
        return n + 1;
    }
}
