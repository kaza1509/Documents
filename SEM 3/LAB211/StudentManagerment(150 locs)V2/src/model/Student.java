package model;

/**
 *
 * @author kazaf
 */
public class Student implements Comparable<Student> {

    private int index = 0;
    private String id;
    private String studentName;
    private String semester;
    private String courseName;

    public Student() {
    }

    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public Student(int index, String id, String studentName, String semester, String courseName) {
        this.index = index;
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public int compareTo(Student that) {
        return this.studentName.compareTo(that.studentName);
    }

    @Override
    public String toString() {
        return String.format("%-15s%-10s%-10s\n", studentName, semester, courseName);
    }

    public String printAllStudent() {
        return String.format("%-10s%-15s%-10s%-10s\n", index, studentName, semester, courseName);
    }

    public String printAllStudentWithId() {
        return String.format("%-10s%-15s%-10s\n", id, studentName, semester);
    }
}
