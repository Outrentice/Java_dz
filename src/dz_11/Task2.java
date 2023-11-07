package dz_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        Date user_date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").parse(scan.nextLine());
        int compare = user_date.compareTo(new Date());

        if (compare > 0)
            System.out.println("Введенное время меньше текущего");
        else if (compare < 0)
            System.out.println("Введенное время больше текущего");
        else System.out.println("Введено текущее время");
    }
}
