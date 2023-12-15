package dz_8;

public class Task3 {
    public static void main(String[] args) {
        SequenceA(8, 1);
    }

    public static int SequenceA(int a, int b) {
        if (b == a)
            return b;

        if (b > a)
            System.out.println(SequenceA(a, b - 1));
        else System.out.println(SequenceA(a, b + 1));

        return b;
    }
}
