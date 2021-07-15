/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.*;

/**
 *
 * @author Khoi Nguyen
 */
public class MyTV {
    //1. đếm và trả về số TV có size lớn giá trị x đã cho
    public int f11(ArrayList<TV> a, int x, String s) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() > x)
                count++;
        }
        return count;
    }
    
    //2. đếm và trả về số TV có name chứa chuỗi s đã cho (không phân biệt chữ hoa thường)
    public int f12(ArrayList<TV> a, int x, String s) {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            String h = a.get(i).getName().toLowerCase();
            if(h.contains(s)) 
                count++;
        }
        return count;
    }
    
    //3. Tính và trả về phần nguyên tổng giá của các TV có size >x
    public int f13(ArrayList<TV> a, int x, String s) {
        double sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice()> x)
                sum+=a.get(i).getPrice();
        }
        return (int)sum;
    }
    
    //4. Tính và trả về tổng các size của TV có name chữa chuỗi s (không phân biệt chữ hoa thường)
    public int f14(ArrayList<TV> a, int x, String s) {
        
        return 0;
    }
    
    //5. Tính và trả về phần nguyên của giá trung bình các TV có trong list
    public int f15(ArrayList<TV> a, int x, String s) {
        
        return 0;
    }
    
    //6. Tính và trả về size của TV có giá gần với giá trị trung bình của list
    public int f16(ArrayList<TV> a, int x, String s) {
        
        return 0;
    }
    
    //7. Đếm và trả về số TV có size nhỏ hơn x và tên không chứa chuỗi s
    public int f17(ArrayList<TV> a, int x, String s) {
        
        return 0;
    }
    
    //8. Tính và trả về phần nguyên của giá trị size trung bình trong list a
    public int f18(ArrayList<TV> a, int x, String s) {
        double avg = 0;
        
        return 0;
    }
    
    //9. Tìm và trả về size phổ biến nhất trong list a
    public int f19(ArrayList<TV> a, int x, String s) {
        ArrayList c = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            for (int j = i; j < a.size(); j++) {
                if (a.get(i).getSize() == a.get(j).getSize()) {
                    count++;
                }
            }
            c.add(count);
        }
        int index = c.indexOf((Integer) Collections.max(c));
        return a.get(index).getSize();
    }
    
    //10. Tìm và trả về size TV có giá nhỏ hơn và gần nhất với giá trị x đã cho
    public int f110(ArrayList<TV> a, int x, String s) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getSize() < x) {
                return a.get(i).getSize();
            }
        }
        return 0;
    }
}
