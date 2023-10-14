package dz_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        for (String item: args)
            System.out.println(item);
        System.out.println(Arrays.toString(args));
    }
}
