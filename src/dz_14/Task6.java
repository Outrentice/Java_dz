package dz_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String regex = "(\\w+@\\w+\\.\\w{2,3})";
        String s = "ass@mail.ru";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);

        if (m1.find())
            System.out.println("Вверный email");
        else
            System.out.println("Неверный email");
    }
}
