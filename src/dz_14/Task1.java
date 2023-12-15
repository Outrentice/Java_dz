package dz_14;

import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("URL: ");
        String[] url = scan.nextLine().split("\\.");

        if (url.length < 1) {
            System.out.println("Неверный URL!");
            return;
        }

        String tld = url[url.length - 1];
        String prot = url[0].split("://")[0];

        if (!Objects.equals(tld, "com") & !Objects.equals(tld, "ru")) {
            System.out.println("Неверный URL!");
            return;
        }
        if (!Objects.equals(prot, "http") & !Objects.equals(prot, "https")) {
            System.out.println("Неверный URL!");
            return;
        }
        System.out.println("URL верный");




    }
}
