package dz_9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Task2 {
    public static void main(String[] args) {
        SortingStudentsByGPA[] iDNumber = {
                new SortingStudentsByGPA(4), new SortingStudentsByGPA(3),
                new SortingStudentsByGPA(40), new SortingStudentsByGPA(27),
                new SortingStudentsByGPA(35), new SortingStudentsByGPA(1)
        };

        Comparator<SortingStudentsByGPA> compar = new SortingStudentsByGPA();

        System.out.println(Arrays.toString(iDNumber));
        Arrays.sort(iDNumber, compar);
        System.out.println(Arrays.toString(iDNumber));
    }
}


class SortingStudentsByGPA implements Comparator<SortingStudentsByGPA> {
    private double assessment;

    SortingStudentsByGPA(){}

    SortingStudentsByGPA(double assessment) {
        this.assessment = assessment;
    }

    public double getAssessment() {
        return assessment;
    }

    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }

    @Override
    public int compare(SortingStudentsByGPA o1, SortingStudentsByGPA o2) {
        if (o1.getAssessment() > o2.getAssessment())
            return -1;
        if (o1.getAssessment() < o2.getAssessment())
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return Double.toString(assessment);
    }
}