package views;

import controler.StudentManagerment;
import java.util.ArrayList;
import java.util.Scanner;
import model.Report;
import model.Student;

/**
 *
 * @author kazaf
 */
public class view {

    StudentManagerment st = new StudentManagerment();

    public void createStudent() {
        if (st.getListStudents().isEmpty()) {
            System.out.println("List student is empty. Please to input here");
        }
        //displayStudent();

        if (st.getListStudents().size() > 10) {
            System.out.print("Do you want to continue (Y/N): ");
            if (!Validate.getYN()) {
                return;
            }
        }
        while (true) {
            String name;
            String id = Validate.getId();
            if (!st.checkIdExsit(id)) {
                name = Validate.getName();
            } else {
                name = st.getNameById(id);
                System.out.println("Name Student: " + name);
            }
            String semester = Validate.getSemeter();
            String course = Validate.getCourse();
            if (!st.checkDuplicateCreate(id, name, semester, course)) {
                st.createStudent(id, name, semester, course);
                System.out.println("Add student successful");
                return;
            }
            System.out.println("Duplicate info.");
        }
    }

    public void findAndSort() {
        if (st.getListStudents().isEmpty()) {
            System.out.println("List student is empty");
            return;
        }

        System.out.print("Enter student name: ");
        String name = new Scanner(System.in).nextLine();
        ArrayList<Student> listSearch = st.findAndSort(name);

        if (listSearch == null) {
            System.out.println("[" + name + "]" + " not found in the list");
            return;
        }

        System.out.println("Found [" + name + "] word in the list");

        System.out.printf("%-15s%-10s%-10s", "Student name", "Semester", "Course Name");
        System.out.println("");
        for (Student student : listSearch) {
            System.out.print(student);
        }
    }

    public void updateOrDelete() {
        ArrayList<Student> listStudents = st.getListStudents();

        if (listStudents.isEmpty()) {
            System.out.println("List student is empty");
            return;
        }
        //displayStudent();

        String id = Validate.getId();
        if (!st.checkIdExsit(id)) {
            System.out.println("Id not exist in list");
            return;
        }

        ArrayList<Student> listSearch = st.getListDeleteOrUpdate(id);
        int maxIndex = 0;

        System.out.printf("%-10s%-15s%-10s%-10s", "Index", "studentName", "semester", "courseName");
        System.out.println("");
        for (int i = 0; i < listSearch.size(); i++) {
            System.out.print(listSearch.get(i).printAllStudent());
            maxIndex = listSearch.get(i).getIndex();
        }

        System.out.print("Do you want to update (U) or delete (D) student: ");
        if (Validate.getUD()) {
            int index = Validate.getInt("Enter index: ", "Invalid index", 0, maxIndex);

            int indexListStudent = st.findStudentList(listSearch.get(index));

            if (indexListStudent == -1) {
                System.out.println("Student not exist");
                return;
            }

            String idUpdate;
            do {
                idUpdate = Validate.getId();
                if (st.checkDuplicateId(idUpdate)) {
                    System.out.print("ID duplicate. ");
                } else {
                    break;
                }
            } while (true);

            String studentName = Validate.getName();
            String semester = Validate.getSemeter();
            String courseName = Validate.getCourse();

            listStudents.set(indexListStudent, new Student(id, studentName, semester, courseName));
            System.out.println("Update successful");
        } else {
            int index = Validate.getInt("Enter index: ", "Invalid index", 0, maxIndex);
            st.deleteStudent(id, index);
            System.out.println("Delete successful");
        }
    }

    public void report() {
        ArrayList<Report> listReport = st.report();
        if (listReport == null) {
            System.out.println("List report is empty");
            return;
        }
        System.out.printf("%-15s%-15s%-15s", "Student Name", "Course Name", "Total");
        System.out.println("");
        for (Report report : listReport) {
            System.out.print(report);
        }
    }

    public void displayStudent() {
        System.out.println("============ Display List ============");
        System.out.printf("%-10s%-15s%-10s", "ID", "Student name", "Semester");
        System.out.println("");
        for (Student student : st.getListStudents()) {
            System.out.print(student.printAllStudentWithId());
        }
        System.out.println("=======================================");
    }
}
