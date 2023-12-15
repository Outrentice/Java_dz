package dz_8;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(SumDigit(19));
    }

    private static int SumDigit(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return SumDigit(n / 10, sum + (n % 10));
    }
    public static int SumDigit(int n) {
        return SumDigit(n, 0);
    }
}
