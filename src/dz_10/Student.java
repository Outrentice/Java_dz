package dz_10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String first_name;
    private String last_name;
    private String profession;
    private int course;
    private String Group;
    private Date birth;

    public Student(String firstName, String lastName, String profession, int course, String group) {
        first_name = firstName;
        last_name = lastName;
        this.profession = profession;
        this.course = course;
        Group = group;
    }

    public Student() {}

    @Override
    public String toString() {
        return first_name + " " + last_name + ", проффесия: " + profession + ", " + course + " курс, группа - " + Group;
    }

    public String toString(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(this.birth);
    }

    public String getFirst_name() { return first_name; }

    public void setFirst_name(String first_name) { this.first_name = first_name; }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) { this.last_name = last_name; }

    public String getProfession() { return profession; }

    public void setProfession(String profession) { this.profession = profession; }

    public int getCourse() { return course; }

    public void setCourse(int course) { this.course = course; }

    public String getGroup() { return Group; }

    public void setGroup(String group) { Group = group; }

    public Date getBirth() { return birth; }

    public void setBirth(Date birth) { this.birth = birth; }
}
