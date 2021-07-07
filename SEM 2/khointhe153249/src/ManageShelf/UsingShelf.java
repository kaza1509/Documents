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
public class UsingShelf {

    public static Scanner sc = new Scanner(System.in);

    public static int amount = 0;

    public static void removeElement(Shelf[] s, int pos) {
        for (int i = pos; i < amount - 1; i++) {
            s[i] = s[i + 1];
        }
        amount--;
    }
    
    public static void removeElementByName(Shelf []s, String name) {
        for (int i = 0; i < amount; i++) {
            if(s[i].getName().equalsIgnoreCase(name)) {
                removeElement(s, i);
            }
        }
    }

    public static void memu() {
        //Quản lí nhiều tủ hồ sơ: 1 tủ hồ sơ gồm: tên, màu sắc và danh sách hồ sơ(Student)
        //1 hồ sơ gồm id, name, agew, gpa
        //Có các chức năng: thêm sửa xóa update sắp xếp tủ.
        System.out.println("---------- FPT Academic Portal ----------");
        System.out.println("1.Add shelf.");
        System.out.println("2.Print shelf.");
        System.out.println("3.Search shelf by name.");
        System.out.println("4.Update shelf by name.");
        System.out.println("5.Sort shelf by name");
        System.out.println("6.Remove shelf in index.");
        System.out.println("7.Remove shelf by name.");
        System.out.println("8.Exit FAP");
        System.out.println("---------- Finish ---------");
        System.out.print("Input choice: ");
    }

    public static void app(Shelf[] s) {
        while (true) {
            memu();
            int choice = Integer.parseInt(sc.nextLine());

//            int amount = 500;
            switch (choice) {
                case 1: {
                    System.out.print("Input amount shelf: ");
                    amount = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < amount; i++) {
                        System.out.println("---------- Shelf " + i + " ----------");
                        s[i] = new Shelf();
                        s[i].input();
                    }
                    break;
                }

                case 2: {
                    //System.out.printf("%-10s%-20s%-4s%10s", "ID", "Name", "Age", "GPA");
                    for (int i = 0; i < amount; i++) {
                        System.out.println("---------- Shelf " + i + " ----------");
                        s[i].output();
                    }
                    break;
                }

                case 3: {
                    int flag = 0, pos = 0;
                    System.out.print("Input name search: ");
                    String name = sc.nextLine();
                    for (int i = 0; i < amount; i++) {
                        if (s[i].getName().equalsIgnoreCase(name)) {
                            flag = 1;
                            pos = i;
                            break;
                        }
                    }
                    if (flag == 1) {
                        System.out.println("Exist shelf in position " + pos);
                    } else {
                        System.err.println("Shelf Not Found");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Input name search: ");
                    String name = sc.nextLine();
                    for (int i = 0; i < amount; i++) {
                        if (s[i].getName().equalsIgnoreCase(name)) {
                            s[i].input();
                        }
                    }
                    break;
                }

                case 5: {
                    for (int i = 0; i < amount - 1; i++) {
                        for (int j = i + 1; j < amount; j++) {
                            if (s[i].getName().compareTo(s[j].getName()) > 0) {
                                Shelf tmp = s[i];
                                s[i] = s[j];
                                s[j] = tmp;
                            }
                        }
                    }
                    break;
                }

                case 6: {
                    System.out.print("Input postion to remove: ");
                    int pos = Integer.parseInt(sc.nextLine());
                    removeElement(s, pos);
                    break;
                }

                case 7: {
                    System.out.print("Input name to remove: ");
                    String name = sc.nextLine();
                    removeElementByName(s, name);
                    break;
                }
                
                case 8: {
                    System.out.println("You are exited");
                    System.exit(0);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Shelf s[] = new Shelf[500];
        app(s);
    }
}
