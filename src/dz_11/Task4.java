package dz_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        Date date_user = new SimpleDateFormat("dd.MM.yyyy HH:mm").parse(scan.nextLine());
        Calendar cal = Calendar.getInstance();
        cal.setTime(date_user);

        System.out.println(date_user);
        System.out.println(cal.getTime());
    }
}
