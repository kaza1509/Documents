/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanfoundry;

/**
 *
 * @author acer
 */
public class Student {
    private String name;
    private String id;
    private int gpa;

    public Student() {
    }

    public Student(String name, String id, int gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", gpa=" + gpa + '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return -1;
//    }
    
}
