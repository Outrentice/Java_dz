package dz_11;

import dz_10.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task3 {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();
        student.setBirth(new SimpleDateFormat("dd.MM.yyyy").parse("27.11.2002"));

        System.out.println(student.toString("dd.MM.yyyy"));
    }
}
