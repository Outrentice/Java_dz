package dz_10;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Object[][] data = {
                {"Oleg", "Pavlov", "IT", 3, "I-103"},
                {"Arthur", "Filin", "IT", 1, "I-461"},
                {"Masha", "Volkova", "Design", 4, "D-71"}
        };

        Student[] iDNumber = setArray(data);

        sortArray(iDNumber);
        outArray(iDNumber);

        Student[] iDNumber2 = setArray(data);
        Student[] res = UnionArray(iDNumber, iDNumber2);
        outArray(res);
    }

    public static Student[] setArray(Object[][] data) {
        Student[] mas = new Student[data.length];

        for (int i=0; i < data.length; i++) {
            mas[i] = new Student(
                    (String)data[i][0], (String)data[i][1],
                    (String)data[i][2], (int)data[i][3], (String)data[i][4]
            );
        }
        return mas;
    }

    public static void outArray(Student[] mas) { System.out.println(Arrays.toString(mas)); }

    public static void sortArray(Student[] mas) {
        Arrays.sort(mas, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getCourse() - o1.getCourse();
            }
        });
    }

    public static Student[] UnionArray(Student[] ar1, Student[] ar2) {
        Student[] res = new Student[ar1.length + ar2.length];
        System.arraycopy(ar1, 0, res, 0, ar1.length);
        System.arraycopy(ar2, 0, res, ar1.length, ar2.length);

        sortArray(res);

        return res;
    }

    public static void quickSort() {}
}
