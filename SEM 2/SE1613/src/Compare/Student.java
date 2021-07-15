/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compare;

/**
 *
 * @author kazaf
 */
public class Student {

    private String name;
    private int age;
    private String id;
    private double gpa;

    public Student() {
    }

    public Student(String name, int age, String id, double gpa) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + "\t" + age + "\t" + id + "\t" + gpa;
    }

}
