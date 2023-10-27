package dz_9;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        SortingStudentsByGPA[] students = {
                new SortingStudentsByGPA(4),
                new SortingStudentsByGPA(3),
                new SortingStudentsByGPA(40)
        };
        SortingStudentsByGPA[] students2 = {
                new SortingStudentsByGPA(27),
                new SortingStudentsByGPA(35),
                new SortingStudentsByGPA(1)
        };
        SortingStudentsByGPA[] students3 = new SortingStudentsByGPA[students.length + students2.length];
        System.arraycopy(students, 0, students3, 0, students.length);
        System.arraycopy(students2, 0, students3, students.length, students2.length);

        System.out.println(Arrays.toString(students3));
        SortUnsorted(students3);
        System.out.println(Arrays.toString(students3));
    }

    private static void SortUnsorted(SortingStudentsByGPA[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);

        SortingStudentsByGPA[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].getAssessment() < buf[i].getAssessment()) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    public static void SortUnsorted(SortingStudentsByGPA[] a) {
        SortUnsorted(a, 0, a.length - 1);
    }
}
