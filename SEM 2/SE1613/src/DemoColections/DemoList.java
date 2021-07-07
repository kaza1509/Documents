/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoColections;

//import java.util.ArrayList;
//import java.util.Vector;
import java.util.*;

/**
 *
 * @author Nguyen Khoi
 */
public class DemoList {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList();
        
        //khi khai báo collection mà chúng ta không khai báo gì đặc biệt thì tức là cúng ta làm việc vs object
        //Mỗi khi add vào thêm vào nó cũng không cần kiểm tra, nó có thể add bất kì thứ gì còn ngước
        //là khi lấy ra nó sẽ trả vè object và muốn lấy lại giá trị ban đầu thì ta buộc phải ép kiểu
        //(casting)
        
        //Khi chúng ta kkhai báo kiểu đặc biệt đó là generics 
        ArrayList<Integer> temp = new ArrayList<>();// generic
        //Mỗi khi add vào ta xem đói tượng thuộc kieeure nguyên hay không 
        //kiểm tra đầu vào, với đầu ra nó sẽ trả về kiểu Integer
        //Lúc đó không cần ép kiểu 
        
        
        Vector vec = new Vector();
//        Add: 
        arr.add(10);//add kiểu nguyên
        arr.add("Hello");//string
        arr.add(true);//login
        arr.add(10);//duplicate
        arr.add(10.5);//double
        arr.add(2,"Không có");// thêm vào index 1 giá trị value
        arr.add("Hello");
//        Display
        System.out.println("c1: arr = "+arr);
        Vector br = new Vector();
        br.add(10);
        br.add(true);
        br.add("Không có");
        System.out.println("br = "+br);
        arr.retainAll(br); //xóa bỏ tất cả các phần tử của arr mà không có trong br (ngược lại removeAll)
        System.out.println("c1: arr = "+arr);
        
        //arr.contains(10) kiểm tra và trả về xem arr có chứa object này hay k 
        //arr.containsAll(br) kiểm tra và trả về xem arr có chứa object của br hay k 
        
//        arr.remove("hello");
//        //chuyển về object
//        arr.remove((Object)10);
        //arr.removeAll(br);////xóa bỏ tất cả các phần tử của arr có trong br
        //giá trị br không đổi
        //phải phải collections thì mới addAll được 
        //System.out.println("arr = "+arr);
        //Để xóa dữ liệu thì ra dùng remove(para);
        //1.Nếu para là số nguyên từ ra xóa vị trí para (0<para<size); -> nếu ko thỏa mãn -> lỗi
        //2.Nếu para là object thì ta sẽ xóa phần tử đâu tiên của list mà có giá trị para, nếu para
        //không có trong list thì không làm gì 
        
        //Để thay đổi dữ liệu ta dùng set(index, value); tháy thế giá trị tại vị trí index = value
        
        //lấy ra qua get
//        System.out.println("br = "+br);
//        arr.add(2,br);//br coi như 1 phần tử
//        //add vào vị trí index, nếu không có nó tự động add vào vị trí cuối 
//        arr.addAll(br);// lấy từng phần tử của br ra rồi add vào arr
//        arr.addAll(2,br);//copy từng phần tử của br add vào vị trí index của arr
//        System.out.println("arr = "+arr);
//        System.out.println("\nc2: arr: ");
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }
//        
//        System.out.println("\nc3: arr: ");
//        for (Iterator it = arr.iterator(); it.hasNext();) {
//            Object next = it.next();
//            System.out.println(next+", ");
//        }
//        
//        System.out.println("\nc4: arr: ");
//        Iterator its = arr.iterator();
//        while(its.hasNext()){
//            Object it = its.next();
//            System.out.println(it+", ");
//        }
//        
//        System.out.println("\nc5: arr: ");
//        for (Object o : arr) {
//            System.out.println(o);
//        }
    }
}
