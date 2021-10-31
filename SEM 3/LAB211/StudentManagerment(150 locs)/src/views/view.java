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

    /**
     * Create a student
     */
    public void createStudent() {
        while (true) {
            String name;
            String id = Validate.getId();
            //Nếu tồn tại id rồi thì tự động print name còn không thì phải nhập
            if (!st.checkIdExsit(id)) {
                name = Validate.getName();
            } else {
                name = st.getNameById(id);
                System.out.println("Name Student: " + name);
            }
            String semester = Validate.getSemeter();
            String course = Validate.getCourse();

            //Check xem student đã tồn tại trong list chưa
            if (!st.checkDuplicateCreate(id, semester, course)) {
                //Nếu không duplicate gọi hàm create bên controler để thêm
                st.createStudent(id, name, semester, course);
                System.out.println("Add student successful");
                //break;
            } else {
                System.out.println("Duplicate info.");
            }

            //Nhập hơn 10 student thì hỏi có muốn nhập nữa không
            if (st.getListStudents().size() >= 10) {
                System.out.print("Do you want to continue (Y/N): ");
                if (!Validate.getYN()) {
                    return;
                }
            }
        }
    }

    /**
     * Tìm vã sắp xếp list tăng dần theo tên
     */
    public void findAndSort() {
        if (st.getListStudents().isEmpty()) {
            System.out.println("List student is empty");
            return;
        }

        System.out.print("Enter student name: ");
        String name = new Scanner(System.in).nextLine();
        //Lấy list đã search bởi name bên controler
        ArrayList<Student> listSearch = st.findAndSort(name);

        //Nếu list rỗng thì thoát luôn
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

    /**
     * Update hoặc Xóa theo tùy chọn (Theo id)
     */
    public void updateOrDelete() {
        //Lấy list student
        ArrayList<Student> listStudents = st.getListStudents();
        if (listStudents.isEmpty()) { //Nếu rỗng thì dừng
            System.out.println("List student is empty");
            return;
        }

        //Lấy id muốn sửa hoặc xóa
        String id = Validate.getId();
        //Nếu id không tồn tại thì dừng
        if (!st.checkIdExsit(id)) {
            System.out.println("Id not exist in list");
            return;
        }

        //Lấy danh sách record theo id của student
        ArrayList<Student> listSearch = st.getListDeleteOrUpdate(id);

        System.out.printf("%-10s%-15s%-10s%-10s", "Index", "studentName", "semester", "courseName");
        System.out.println("");
        for (int i = 0; i < listSearch.size(); i++) {
            System.out.print(listSearch.get(i).printAllStudent());
        }
        //Lấy index lớn nhất
        int maxIndex = listSearch.get(listSearch.size() - 1).getIndex();

        int index = Validate.getInt("Enter index: ", "Invalid index", 0, maxIndex);
        System.out.print("Do you want to update (U) or delete (D) student: ");
        //Update option...
        if (Validate.getUD()) {
            //Lấy vị trí muốn update trong list student
            int indexListStudent = st.findStudentList(listSearch.get(index));

            String idUpdate;
            do {
                //Check update trùng id
                idUpdate = Validate.getId();
                if (st.checkDuplicateUpdateId(idUpdate)) {
                    System.out.print("ID duplicate. ");
                } else {
                    break;
                }
            } while (true);

            String studentName = Validate.getName();

            //Nếu update thì phải set lại tên tất cả record
            for (Student student : listStudents) {
                if(student.getId().equalsIgnoreCase(id)) {
                    student.setStudentName(studentName);
                }
            }

            String semester = Validate.getSemeter();
            String courseName = Validate.getCourse();

            //set lại student đã update vào vị trí của listStudent
            listStudents.set(indexListStudent, new Student(id, studentName, semester, courseName));
            System.out.println("Update successful");
        } else {
            //Delete option
            //Xóa student bởi id ở vị trí index trong list student
            st.deleteStudent(id, index);
            System.out.println("Delete successful");
        }
    }

    /**
     * In ra list report
     */
    public void report() {
        //Lấy list report bên controler
        ArrayList<Report> listReport = st.report();
        if (listReport.isEmpty()) {
            System.out.println("List report is empty");
            return;
        }
        System.out.printf("%-15s%-15s%-15s", "Student Name", "Course Name", "Total");
        System.out.println("");
        for (Report report : listReport) {
            System.out.print(report);
        }
    }
//
//    public void displayStudent() {
//        System.out.println("============ Display List ============");
//        System.out.printf("%-10s%-15s%-10s%-10s", "ID", "Student name", "Semester", "Course name");
//        System.out.println("");
//        for (Student student : st.getListStudents()) {
//            System.out.print(student.printAllStudentWithId());
//        }
//        System.out.println("=======================================");
//    }
//
//    public void showYN() {
//        System.out.print("Do you want to see list student(Y/N): ");
//        if (Validate.getYN()) {
//            displayStudent();
//        }
//    }
}
