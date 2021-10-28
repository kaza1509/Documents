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
        listStudents.add(new Student("1", "Khoi", "Spring", "Java"));
        listStudents.add(new Student("2", "Long", "Summer", ".Net"));
        listStudents.add(new Student("3", "Chinh", "Fall", "C/C++"));
        listStudents.add(new Student("1", "Khoi", "Summer", ".Net"));
        listStudents.add(new Student("1", "Khoi", "Fall", "Java"));
        listStudents.add(new Student("2", "Long", "Fall", ".Net"));
    }

    /**
     * Create a Student
     *
     * @param id id Student
     * @param name name Student
     * @param semester semester of Student
     * @param course course of Student
     */
    public void createStudent(String id, String name, String semester, String course) {
        listStudents.add(new Student(id, name, semester, course));
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public ArrayList<Student> findAndSort(String name) {
        ArrayList<Student> listSearch = new ArrayList<>();
        boolean isSearch = false;

        for (Student student : listStudents) {
            if (student.getStudentName().toUpperCase().contains(name.toUpperCase())) {
                isSearch = true;
                listSearch.add(student);
            }
        }
        if (isSearch) {
            Collections.sort(listStudents);
            return listSearch;
        }
        return null;
    }

    public ArrayList<Report> report() {
        ArrayList<Report> listReport = new ArrayList<>();

        for (Student student : listStudents) {
            int total = 0;
            String id = student.getId();
            String courseName = student.getCourseName();
            String studentName = student.getStudentName();

            for (int i = 0; i < listStudents.size(); i++) {
                if (listStudents.get(i).getId().equalsIgnoreCase(id)
                        && listStudents.get(i).getCourseName().equalsIgnoreCase(courseName)
                        && listStudents.get(i).getStudentName().equalsIgnoreCase(studentName)) {
                    total++;
                }
            }

            if (!checkReportDuplicate(listReport, id, studentName, courseName)) {
                listReport.add(new Report(id, studentName, courseName, total));
            }
        }
        return listReport;
    }

    //-------------------------------------------------------------
    public ArrayList<Student> getListDeleteOrUpdate(String id) {
        ArrayList<Student> listDelete = new ArrayList<>();
        int index = 0;
        for (Student student : listStudents) {
            if (student.getId().equalsIgnoreCase(id)) {
                student.setIndex(index);
                listDelete.add(student);
                index++;
            }
        }
        return listDelete;
    }

    public void deleteStudent(String id, int index) {
        ArrayList<Student> listDelete = getListDeleteOrUpdate(id);
        listStudents.remove(listDelete.get(index));
    }

    public boolean checkIdExsit(String id) {
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDuplicateCreate(String id, String studentName, String semester, String courseName) {
        for (Student student : listStudents) {
            if (student.getId().equalsIgnoreCase(id)
                    && student.getStudentName().equalsIgnoreCase(studentName)
                    && student.getSemester().equalsIgnoreCase(semester)
                    && student.getCourseName().equalsIgnoreCase(courseName)) {
                return true;
            }
        }
        return false;
    }

    public String getNameById(String id) {
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getId().equalsIgnoreCase(id)) {
                return listStudents.get(i).getStudentName();
            }
        }
        return null;
    }

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

    public boolean checkDuplicateId(String id) {
        for (Student student : listStudents) {
            if (student.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

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
}
