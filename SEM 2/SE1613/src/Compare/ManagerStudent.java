/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author kazaf
 */
public class ManagerStudent {
    
    public static void sortNameToGpa() {
        
    }
    
    public static void sortGpa(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa() > o2.getGpa())
                    return 1;
                else if (o1.getGpa() < o2.getGpa()) {
                    return -1;
                }
                else {
                    if(o1.getName().compareTo(o2.getName()) > 0)
                        return 1;
                    else {
                        return -1;
                    }
                }
            }
            
        });
    }
    
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        
        list.add(new Student("KHÔI", 20, "HE153249", 7.0));
        list.add(new Student("LINH", 19, "HE345267", 7.0));
        list.add(new Student("NGỌC", 21, "HE237567", 9.0));
        list.add(new Student("TÙNG", 20, "HE342565", 8.5));
        list.add(new Student("BÁCH", 17, "HE353247", 8.0));
        
        System.out.println("Before sorting is:");
        
        System.out.println("---------------------------------");
        print(list);
        System.out.println("---------------------------------");
        
        System.out.println("After sorting is:");
        
        sortGpa(list);
        //sortNameToGpa();
        
        print(list);
    }
    
    public static void print(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
