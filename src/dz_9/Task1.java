package dz_9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Student[] iDNumber = {
                new Student(4), new Student(3),
                new Student(40), new Student(27),
                new Student(35), new Student(1)
        };

        System.out.println(Arrays.toString(iDNumber));
        InsertSort(iDNumber);
        System.out.println(Arrays.toString(iDNumber));
    }
    public static void InsertSort(Student[] mas) {
        int j = 0;
        for (int i=1; i < mas.length; i++) {
            Student swap = mas[i];

            for (j=i; j > 0 && mas[j - 1].getAssessment() > swap.getAssessment(); j--) {
                mas[j] = mas[j - 1];
            }
            mas[j] = swap;
        }
    }
}


class Student {
    private double assessment;

    Student(double assessment) {
        this.assessment = assessment;
    }


    public double getAssessment() {
        return assessment;
    }

    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }

    @Override
    public String toString() {
        return Double.toString(assessment);
    }
}
