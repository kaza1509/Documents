/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerstudent;

import data.Student;
import java.util.ArrayList;
import java.util.Scanner;
import menu.Menu;
import validate.CheckValidate;

/**
 *
 * @author kazaf
 */
public class ManagerStudent {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        managerStudent();
    }

    public static void managerStudent() {
        Menu m = new Menu(); 
        CheckValidate c = new CheckValidate();
        ArrayList<Student> listStudent = new ArrayList<>();
        while (true) {
            m.menu();
            int choice = c.getAnInteger();
            
            switch (choice) {
                case 1: {
                    m.inputStudent(listStudent);
                    break;
                }

                case 2: {
                    m.outputStudent(listStudent);
                    break;
                }

                case 3: {
                    System.out.println("The student has max mark: ");
                    m.showMaxMarkOfStudents(listStudent).output();
                    
                    System.out.println("The student has min mark: ");
                    m.showMinMarkOfStudents(listStudent).output();
                    
                    break;
                }

                case 4: {
                    System.out.println("----- Search by rollNo -----");
                    m.searchStudentById(listStudent);
                    break;
                }

                case 5: {
                    m.sortStudentFromAtoZ(listStudent);
                    break;
                }

                case 6: {
                    m.sortStudentHasScholarship(listStudent);
                    break;
                }

                case 7: {
                    m.changeInfoByRollNo(listStudent);
                    break;
                }
                
                case 8: {
                    
                    break;
                }
                
                case 9: {
                    System.out.println("You exited program.");
                    System.exit(0);
                }

                default: {
                    System.err.println("Re-input(1 -> 7)");
                    break;
                }
            }
        }
    }

}
