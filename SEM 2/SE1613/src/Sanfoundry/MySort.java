/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanfoundry;

import java.util.Comparator;

/**
 *
 * @author acer
 */
public class MySort implements Comparator{
    public int compare(Object o1, Object o2) {
        int kq = 0;
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        
        if(s1.getGpa()!=s2.getGpa()) {
            kq = -Integer.compare(s1.getGpa(), s2.getGpa());
        }
        else {
            if(s1.getName().equals(s2.getName())) {
                kq = s1.getName().compareTo(s2.getName());
            }
            else {
                kq = s1.getId().compareTo(s1.getId());
            }
        }
        return kq;
    }
}
