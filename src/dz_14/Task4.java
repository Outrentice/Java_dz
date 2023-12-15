package dz_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String regex = "(\\d+\\s[+])";
        String s = "(1 + 8) – 9 + 4";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);

        System.out.println("Список цифр, за которыми идет +: ");
        while (m1.find()) {
            System.out.println(m1.group().split("\\+")[0]);
        }
    }
}
