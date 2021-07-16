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
        
        //========================== f1 ==========================
        //System.out.println("Số lượng tivi có size > x: "+mt.f11(list, 40, ""));
        //System.out.println("Số lượng tivi có tên chưa chuỗi s: "+mt.f12(list, 0, "An"));
        //System.out.println("Tổng giá số tivi có giá > x: "+mt.f13(list, 8, ""));
        //System.out.println("Tổng các size của TV có name chữa chuỗi s: "+mt.f14(list, 0, "An"));
        //System.out.println("Giá nguyên trung bình các TV có trong list s: "+mt.f15(list, 0, ""));
        //System.out.println("Size của TV có giá gần với giá trị trung bình của list: "+mt.f16(list, 0, ""));
        //System.out.println("Số TV có size nhỏ hơn x và tên không chứa chuỗi s: "+mt.f17(list, 43, "AN"));
        //System.out.println("Giá trị size trung bình trong list a: "+mt.f18(list, 0, ""));
        //System.out.println("Phổ biến: "+mt.f19(list, 0, ""));
        //System.out.println("Size nhỏ hơn gần nhất với x: "+mt.f110(list, 37, ""));
        
        //========================== f2 ==========================
        //mt.f21(list, 0, "");
        //mt.f22(list, 0, "");
        //mt.f23(list, 30, "");
        //mt.f24(list, 44, "");
        //mt.f25(list, 0, "An");
        //mt.f26(list, 44, "");
        //mt.f27(list, 0, "");
        //mt.f28(list, 0, "");
        mt.f29(list, 0, "");
        //mt.f210(list, 0, "");
        //mt.f211(list, 0, "");
        //mt.f212(list, 0, "");
    }
}
