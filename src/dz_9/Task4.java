package dz_9;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(new Compar(3).compareTo(new Compar(5)));
    }
}

class Compar implements Comparable<Compar> {
    private int prom;

    Compar(int prom) {
        this.prom = prom;
    }


    @Override
    public int compareTo(Compar o) {
        return this.prom - o.prom;
    }
}
