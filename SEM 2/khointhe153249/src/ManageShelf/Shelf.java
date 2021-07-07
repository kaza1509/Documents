/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageShelf;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Shelf {

    protected String coLor;
    private String name;

    private Scanner sc = new Scanner(System.in);
    private int amount = 500;
    private Student[] list = new Student[amount];

    public Shelf() {
    }

    public Shelf(String coLor, String name, Student list[]) {
        this.coLor = coLor;
        this.name = name;
        this.list = new Student[amount];
    }

    public String getCoLor() {
        return coLor;
    }

    public void setCoLor(String coLor) {
        this.coLor = coLor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getList() {
        return list;
    }

    public void setList(Student[] list) {
        this.list = list;
    }

    public void input() {
        System.out.print("Input color shelf: ");
        coLor = sc.nextLine();
        System.out.print("Input name shelf: ");
        name = sc.nextLine();

        System.out.println("Input list file: ");
        System.out.print("Input amount file: ");
        amount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < amount; i++) {
            System.out.println("----- File " + i + " ------");
            System.out.print("Input id: ");
            String id = sc.nextLine();
            System.out.print("Input name: ");
            String namef = sc.nextLine();
            System.out.print("Input age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Input gpa: ");
            double gpa = Double.parseDouble(sc.nextLine());
            list[i] = new Student(id, namef, age, gpa);
        }
    }

    public void output() {
        System.out.println("Color shelf: " + coLor);
        System.out.println("Name shelf: " + name);
        System.out.printf("%-10s%-20s%-4s%10s", "ID", "Name", "Age", "GPA\n");
        for (int i = 0; i < amount; i++) {
            System.out.println(list[i]);
        }
    }
}
