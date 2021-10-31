package controler;

import java.util.ArrayList;
import java.util.Collections;
import model.Report;
import model.Student;

/**
 *
 * @author kazaf
 */
public class StudentManagerment {

    private ArrayList<Student> listStudents = new ArrayList<>();

    public StudentManagerment() {
        //Demo 9 record
        listStudents.add(new Student("1", "Khoi", "1", "Java"));
        listStudents.add(new Student("2", "Long", "5", ".Net"));
        listStudents.add(new Student("3", "Chinh", "4", "C/C++"));
        listStudents.add(new Student("1", "Khoi", "1", ".Net"));
        listStudents.add(new Student("1", "Khoi", "2", "Java"));
        listStudents.add(new Student("2", "Long", "5", ".Net"));
        listStudents.add(new Student("4", "Hao", "4", ".Net"));
        listStudents.add(new Student("4", "Hao", "2", "Java"));
        listStudents.add(new Student("5", "Lieu", "3", "C/C++"));
    }

    /**
     * Tạo student
     * @param id id Student
     * @param name name Student
     * @param semester semester of Student
     * @param course course of Student
     */
    public void createStudent(String id, String name, String semester, String course) {
        listStudents.add(new Student(id, name, semester, course));//Thêm student vào list
    }

    /**
     * Lấy danh sách student
     * @return listStudents list
     */
    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    /**
     * Tìm và sắp xếp danh sách student
     * @param name tìm bởi tên
     * @return list tìm thấy
     */
    public ArrayList<Student> findAndSort(String name) {
        ArrayList<Student> listSearch = new ArrayList<>();
        boolean isSearch = false;

        //Tìm student có chứa tên name
        for (Student student : listStudents) {
            if (student.getStudentName().toUpperCase().contains(name.toUpperCase())) {
                isSearch = true;
                listSearch.add(student);
            }
        }
        if (isSearch) {
            Collections.sort(listSearch); //sắp xếp tăng dần theo tên
            return listSearch;
        }
        return null;
    }

    /**
     * Thêm vào list report
     * @return list report
     */
    public ArrayList<Report> report() {
        ArrayList<Report> listReport = new ArrayList<>();

        for (Student student : listStudents) {
            int total = 0; //total khóa học từng student có cùng môn
            String id = student.getId();
            String courseName = student.getCourseName();
            String studentName = student.getStudentName();

            //Nếu có cùng id và môn học thì thêm vào total
            for (int i = 0; i < listStudents.size(); i++) {
                if (listStudents.get(i).getId().equalsIgnoreCase(id)
                        && listStudents.get(i).getCourseName().equalsIgnoreCase(courseName)
                        && listStudents.get(i).getStudentName().equalsIgnoreCase(studentName)) {
                    total++;
                }
            }
            //Nếu không trùng lặp report thì thêm vào list report
            if (!checkReportDuplicate(listReport, id, studentName, courseName)) {
                listReport.add(new Report(id, studentName, courseName, total));
            }
        }
        return listReport;
    }

    /**
     * Lấy danh sách Delete or Update và thêm cột index
     * @param id id tìm
     * @return danh sách tìm thấy bởi id
     */
    public ArrayList<Student> getListDeleteOrUpdate(String id) {
        ArrayList<Student> listSearch = new ArrayList<>();
        int index = 0;
        //duyệt danh sách student tìm được từ id để set index vào theo thứ tự tăng dần
        for (Student student : listStudents) {
            if (student.getId().equalsIgnoreCase(id)) {
                student.setIndex(index);
                listSearch.add(student);
                index++;
            }
        }
        return listSearch;
    }

    /**
     * Xóa student trong list student ở vị trí index của listDeleteOrUpdate
     * @param id id 
     * @param index index
     */
    public void deleteStudent(String id, int index) {
        ArrayList<Student> listDelete = getListDeleteOrUpdate(id);
        //Xóa student trong list
        listStudents.remove(listDelete.get(index));
    }
    //-------------------------------------------------------------

    /**
     * Kiểm tra record student đã tồn tại hay chưa
     * @param id id tìm
     * @param semester semeter tìm
     * @param courseName course name tìm
     * @return boolean
     */
    public boolean checkDuplicateCreate(String id, String semester, String courseName) {
        for (Student student : listStudents) {
            if (student.getId().equalsIgnoreCase(id)
                    && student.getSemester().equalsIgnoreCase(semester)
                    && student.getCourseName().equalsIgnoreCase(courseName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Lấy tên bằng id
     * @param id id
     * @return Name
     */
    public String getNameById(String id) {
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getId().equalsIgnoreCase(id)) {
                return listStudents.get(i).getStudentName();
            }
        }
        return null;
    }

    /**
     * Check xem record trong list report có trùng nhau không
     * @param listReport list report
     * @param id id
     * @param Studentname name student
     * @param courseName course name
     * @return boolean
     */
    public boolean checkReportDuplicate(ArrayList<Report> listReport,
            String id, String Studentname, String courseName) {
        for (Report report : listReport) {
            if (report.getId().equalsIgnoreCase(id)
                    && report.getCourseName().equalsIgnoreCase(courseName)
                    && report.getStudentName().equalsIgnoreCase(Studentname)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check xem id đã tồn tại trong list student hay chưa
     * @param id id tìm kiếm
     * @return boolean
     */
    public boolean checkIdExsit(String id) {
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Check id update vào với id trong list cho trùng nhau không
     * @param id id cần check
     * @return boolean
     */
    public boolean checkDuplicateUpdateId(String id) {
        for (Student student : listStudents) {
            //Nếu bằng id trong list và khác id cũ lúc chưa upate thì trả về true
            if (student.getId().equalsIgnoreCase(id) && !student.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Tìm vị trí student trong list student
     * @param s student
     * @return vị trí student trong list
     */
    public int findStudentList(Student s) {
        for (Student student : listStudents) {
            if (student.getId().equalsIgnoreCase(s.getId())
                    && student.getCourseName().equalsIgnoreCase(s.getCourseName())
                    && student.getSemester().equalsIgnoreCase(s.getSemester())) {
                return listStudents.indexOf(student);
            }

        }
        return -1;
    }
    
    /**
     * Lấy Student bởi id
     * @param id
     * @return 
     */
    public Student getStudentById(String id) {
        for (Student student : listStudents) {
            if(student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }
}
