/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import data.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import validate.CheckValidate;

/**
 *
 * @author kazaf
 */
public class Menu {

    private Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("=============== Manager student ===============");
        System.out.println("1.Input student.");
        System.out.println("2.Output student.");
        System.out.println("3.Show student has max - min mark.");
        System.out.println("4.Search student following rollNo.");
        System.out.println("5.Sort student following A -> Z.");
        System.out.println("6.Sort student have scholarship decreasing.");
        System.out.println("7.Exit program.");
        System.out.println("===============================================");
        System.out.print("Please, Input your choice(1 -> 7): ");
    }

    public void inputStudent(ArrayList<Student> listStudent) {
        CheckValidate c = new CheckValidate();
        System.out.print("Input amount of students: ");
        int amount = c.getAnInteger();

        for (int i = 0; i < amount; i++) {
            System.out.println("----- Input " + (i + 1) + " th student -----");
            Student e = new Student();
            e.input();
            listStudent.add(e);
        }
    }
    
    public void outputStudent(ArrayList<Student> listStudent) {
        System.out.printf("|%-15s|%5s|%5s|%20s|%9s|%5s|\n", "name", "sex", "yob", "address", "rollNo", "mark");
        for (int i = 0; i < listStudent.size(); i++) {
            listStudent.get(i).output();
        }
    }
    
    public Student showMaxMarkOfStudents(ArrayList<Student> listStudent) {
        double maxMark  = listStudent.get(0).getMark();
        int indexMax = 0;
                
        for (int i = 1; i < listStudent.size(); i++) {
            if(listStudent.get(i).getMark() > maxMark){
                maxMark  = listStudent.get(i).getMark();
                indexMax = i;
            }
        }
        
        return listStudent.get(indexMax);
    }
    
    public Student showMinMarkOfStudents(ArrayList<Student> listStudent) {
        double minMark  = listStudent.get(0).getMark();
        int indexMin = 0;
        
        for (int i = 1; i < listStudent.size(); i++) {
            if(listStudent.get(i).getMark() < minMark) {
                minMark = listStudent.get(i).getMark();
                indexMin = i;
            }
        }
        return listStudent.get(indexMin);
    }
    
    public void searchStudentById(ArrayList<Student> listStudent) {
        CheckValidate c = new CheckValidate();
        int indexSearch = -1;
        System.out.print("Input rollNo(HEXXXXXX): ");
        String rollNo = c.getAnID();
        for (int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getRollNo().equals(rollNo))
                indexSearch = i;
        }
        if(indexSearch == -1)
            System.err.println("RollNo "+rollNo+" not found");
        else {
            System.out.println(rollNo+" was found. This is all of information:");
            listStudent.get(indexSearch).output();
        }
    }

    public void sortStudentFromAtoZ(ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        
        outputStudent(listStudent);
    }

    public void sortStudentHasScholarship(ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.getMark() - o1.getMark());
            }
        });
        
        outputStudent(listStudent);
    }
}
