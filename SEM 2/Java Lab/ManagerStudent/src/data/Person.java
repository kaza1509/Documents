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
public class Person {

    protected String name;
    protected String sex;
    protected int yob;
    protected String address;

    public Person() {
    }

    public Person(String name, String sex, int yob, String address) {
        this.name = name;
        this.sex = sex;
        this.yob = yob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        CheckValidate c = new CheckValidate();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input sex: ");
        sex = sc.nextLine();
        System.out.print("Input yob: ");
        yob = c.getAnInteger();
        System.out.print("Input address: ");
        address = sc.nextLine();
    }

    public void output() {
        System.out.printf("|%-20s|%5s|%5d|%20s", name, sex, yob, address);
    }
}
