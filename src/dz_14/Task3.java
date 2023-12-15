package dz_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String regex = "(\\d+\\.{0,1})(\\d{1,2})\\s(\\w{2,3})";
        String s = "Цены 30.13 USD 50.30 RUS 60.12 CHF 11,23" ;
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);

        System.out.println("Список цен: ");
        while (m1.find()) {
            System.out.println("\t" + m1.group());
        }
    }
}
