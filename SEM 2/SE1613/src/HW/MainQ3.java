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
        
        //System.out.println("Số lượng tivi có size > x: "+mt.f11(list, 40, ""));
        //System.out.println("Số lượng tivi có tên chưa chuỗi s: "+mt.f12(list, 0, "An"));
        //System.out.println("Tổng giá số tivi có giá > x: "+mt.f13(list, 8, ""));
        
        //System.out.println("Size nhỏ hơn gần nhất với x: "+mt.f110(list, 37, ""));
        //System.out.println("Phổ biến: "+mt.f19(list, 0, ""));
    }
}
