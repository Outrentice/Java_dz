package dz_11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        long startAr5 = System.nanoTime();

        ArrayList<Integer> arList = new ArrayList<Integer>();
        arList.add(1);
        arList.add(2);
        arList.add(3);

        long endAr5 = System.nanoTime();

        System.out.println("ArrayList: " + (double)(endAr5 - startAr5) / 1000000 + " milliseconds");

        long startLi5 = System.nanoTime();

        LinkedList<Integer> liList = new LinkedList<Integer>();
        liList.add(1);
        liList.add(2);
        liList.add(3);

        long endLi5 = System.nanoTime();

        System.out.println("LinkedList: " + (double)(endLi5 - startLi5) / 1000000 + " milliseconds");
    }
}
