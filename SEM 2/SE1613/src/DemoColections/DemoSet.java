/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoColections;
import java.util.*;

//cho 1 treeSet lưu chữ 1 danh sách sinh viên trong đó các sih viên
//sv {id, name, gpa}, yêu cầu, gpa giảm dần  (nếu cùng gpa sort name tăng dần), 
//nếu cùng name thì sort id tăng dần 

//set bao gồm String, Integer (String đứng trước Integer, cùng String sort giảm dần)
//String giảm -> Integer tăng

class MySort implements Comparator{
    public int compare(Object o1, Object o2) {
        int kq = 0;
        if((o1 instanceof String)&&(o2 instanceof Integer)) kq = -1;
        if((o2 instanceof String)&&(o1 instanceof Integer)) kq = 1;
        if((o1 instanceof String)&&(o2 instanceof String)) 
            kq = -((String)o1).compareTo((String)o2);
        if((o1 instanceof Integer)&&(o2 instanceof Integer)) 
            kq = Integer.compare((int)o1, (int)o2);
        
        return kq;
        
    }
}

class DemoSet {
    public static void main(String[] args) {
        MySort mysort = new MySort();
        TreeSet ts = new TreeSet();
        ts.add(5);
        ts.add(10);
        ts.add(20);
        ts.add(1);
        ts.add(7);
        ts.add("Hello");
        System.out.println(ts);
    }
}

//Tree Set = hash set + sort (chút nữa làm map set trong collection)

/**
 *
 * @author acer
 */
/*
public class DemoSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(5);//thêm
        hs.add(10);
        hs.add(15);
        hs.add("hello");
        hs.add("tam biet");
        hs.add(true);
        hs.add(new Integer(10));
        hs.add(new String("tam biet"));// có phân biệt chữ hoa thường
        //không lặp lại - can not duplicate
        //không indexing
        System.out.print("hs = "+hs);
        
        //trong set không update chỉ có delete, add
        hs.remove(obj);
        //Nếu obj tồn tại trong set thì nó sẽ xóa bỏ giá trị obj khỏi set đồng thời dẽ trả về true
        //nếu obj không tồn tại trong set nó sẽ hông xóa và method trả về false
        hs.removeAll(Collections);// trả về true nếu set thay đổi
        //đã xóa ít nhât 1 phần tử nếu trả về true
        //nếu không xóa bất kì phần tử nào thì sẽ trả về false
        
        hs.contains(obj);// kiểm tra xem hash set có chưa obj không
        hs.retainAll(collection);//giống list
        
        
        
//        System.out.println("");
//        
//        //c2: for each
//        for (Object h : hs) {
//            System.out.print(h+", ");
//        }
//        
//        System.out.println("");
//        
//        for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
//            Object next = iterator.next();
//            System.out.print(next+", ");
//        }
//        
//        System.out.println("");
//        
//        Iterator it = hs.iterator();
//        while (it.hasNext()) {
//            Object obj = it.next();
//            System.out.print(obj+", ");
//        }
    }
}
*/