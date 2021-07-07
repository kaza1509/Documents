package DemoColections;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        //HashMap hm = new HashMap();// generic
        
        HashMap<String, String> hm = new HashMap<>();
        hm.put("one", "một");
        hm.put("two", "hai");
        hm.put("three", "ba");
        
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key = "+key+ ": value = "+value);
        }
        
        //add update delete search
//        hm.put("one", "mot");
//        hm.put("two", 2);
//        hm.put(3, "ba");
//        //display
//        //c1
//        System.out.println(hm);
        
        //kiểm tra phần tử tồn tại trong map không
//        hm.containsKey(hm)
        
//        System.out.println(hm.remove(3, "ba"));
//        System.out.println(hm);
        //hm.remove(key, value);
        //nếu cặp key và value tồn tại trong map thì nó sẽ xóa bỏ cặp giá trị và trả về true
        //Nếu cặp (k,v) không tồn tại thì đồng thời sẽ trả về false
        
//        System.out.println(hm.remove(33));
//        System.out.println(hm);
        //method delete
        //hm.remove(key); 
        //nếu key tồn tại thì sẽ xóa bỏ phần tử ứng với key trong map đó đồng thời cái method sẽ trả về
        //value ứng với key đã xóa
        //còn nếu key không tồn tại trong map thì nó do nothing đồng thời giá tỉ trả về là null
        
        
        /*
        System.out.println(hm);
        hm.put("two", "hai");// nếu key chưa tồn tại thì cặp key và value add vào trong map
        //nếu key và value tồn tại thì key và value update bằng giá trị mới
        // -> put tương đương vs update 
        hm.putIfAbsent(3, "ba ba ba");// Nếu mà key chưa tồn tai nó sẽ add cặp key và value vào trong map
        //Khi tồn tại rồi thì không làm gì cả 
        System.out.println(hm); */
        
        //c2: keySet()
        //lấy toàn bộ key của hashMap rồi trả về 1 set
//        Set keys = new hm.keySet();
//        for (Object key : keys) {
//            System.out.println("Key = "+key+ ": value = "+hm.get(key));
//        }
//        
//        for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
//            Object key = iterator.next();
//            System.out.println("Key = "+key+ ": value = "+hm.get(key));
//        }
//        
//        Iterator it = keys.iterator();
//        while (it.hasNext()) {
//            Object key = it.next();
//            System.out.println("Key = "+key+ ": value = "+hm.get(key));
//        }
    }
}
