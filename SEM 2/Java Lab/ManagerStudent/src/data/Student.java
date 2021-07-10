/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;
import validate.CheckValidate;

/**
 *
 * @author kazaf
 */
public class Student extends Person {

    private String rollNo;
    private double mark;

    public Student() {
    }

    public Student(String name, String sex, int yob, String address, String rollNo, double mark) {
        super(name, sex, yob, address);
        this.rollNo = rollNo;
        this.mark = mark;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        CheckValidate c = new CheckValidate();
        super.input();
        System.out.print("Input rollNo(HEXXXXXX): ");
        //rollNo = sc.nextLine();
        rollNo = c.getAnID();
        System.out.print("Input mark(0.0 -> 10.0): ");
        mark = c.getAnMark();
    }

    @Override
    public void output() {
        System.out.printf("|%-15s|%5s|%5d|%20s|%9s|%5.1f|\n", name, sex, yob, address, rollNo, mark);
    }
}
