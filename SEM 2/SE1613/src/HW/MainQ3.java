/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.ArrayList;

/**
 *
 * @author Khoi Nguyen
 */
public class MainQ3 {
    
    public static void print(ArrayList<TV> list) {
        System.out.println("------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------------------");
    }
    
    public static void main(String[] args) {
        ArrayList<TV> list = new ArrayList<TV>();
        MyTV mt = new MyTV();
        list.add(new TV("SONY", 42, 8.7));
        list.add(new TV("SAMSUNG", 45, 10.7));
        list.add(new TV("PANASONIC", 36, 6.5));
        list.add(new TV("NISSAN", 49, 11));
        list.add(new TV("VOSWAGAN", 21, 4));
        list.add(new TV("VINGAS", 36, 7.6));
        
        print(list);
        
        //System.out.println("Test case f110: "+mt.f110(list, 37, ""));
        //mt.f10(list, 0, "");
        System.out.println("Phổ biến: "+mt.f9(list, 0, ""));
    }
}
