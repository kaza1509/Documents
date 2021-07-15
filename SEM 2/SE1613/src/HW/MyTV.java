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

    //10. Tìm và trả về size TV có giá nhỏ hơn và gần nhất với giá trị x đã cho
    public int f110(ArrayList<TV> a, int x, String s) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getSize() < x) {
                return a.get(i).getSize();
            }
        }
        return 0;
    }

    //9. Tìm và trả về size phổ biến nhất trong list a
    public int f9(ArrayList<TV> a, int x, String s) {
//        ArrayList<Integer> arSize = new ArrayList<>();
//        arSize.add(a.get(0).getSize());
//        
//        //LẤY PHẦN TỬ SIZE RIÊNG BIỆT
//        for (int i = 1; i < a.size(); i++) {
//            boolean f = true;
//            for (int j = 0; j < arSize.size(); j++) {
//                if(arSize.get(j) == a.get(i).getSize()) {
//                    f = false;
//                    break;
//                }
//            }
//            if(f == true) arSize.add(a.get(i).getSize());
//        }
//        
//        //LẤY CÁC PHẦN TỬ ĐẾM
//        ArrayList<Integer> arCount = new ArrayList<>();
//        for (int i = 0; i < arSize.size(); i++) {
//            int count = 0;
//            for (int j = 0; j < a.size(); j++) {
//                if(arSize.get(i) == a.get(j).getSize())
//                    count++;
//            }
//            arCount.add(count);
//        }
//        
//        //LẤY VỊ TRÍ CỦA PHẦN TỬ MAX COUNT CŨNG LÀ VỊ TRÍ CỦA PHẦN TỬ MAX SIZE
//        int indexCount = 0;
//        int maxCout = arCount.get(0);
//        for (int i = 0; i < arCount.size(); i++) {
//            if(maxCout < arCount.get(i)) {
//                maxCout = arCount.get(i);
//                indexCount = i;
//            }
//        }
//        
//        //LẤY RA PHẦN TỬ MAX SIZE
//        return arSize.get(indexCount);
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
}
