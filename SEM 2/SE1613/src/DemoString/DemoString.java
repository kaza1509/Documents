/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoString;
/**
 *
 * @author Nguyen Khoi
 */
public class DemoString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(" s1==s2 "+(s1==s2));
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(" s3==s4 "+(s3==s4));
        System.out.println("s3 equal s4: "+s3.equals(s4));
        //đối với toán tử == nó so sánh cả về giá trị lẫn địa chỉ 
        //khi dùng == đối với 2 object nếu 1 trong 2 object mà được khởi tạo bằng từ khóa new
        //thì 2 đói tượng đó không bao giờ bằng nhau 
        //một đối tượng được khởi tạo bằng từ khóa new sẽ không bao giờ bằng đối tượng khác
//        String s5 = new String(new char[]{'H','E','L','L','O'});
//        System.out.println("s5 = "+s5);
//        System.out.println("s3 equals s5: "+s3.equals(s5));
//        System.out.println("s3 equalIgnoreCase s5: "+s3.equalsIgnoreCase(s5));
//        System.out.println("s5 toLowerCase: "+s5.toLowerCase());
//        System.out.println("s5 = "+s5);
        String s6 = "Cong   Hoa xa hoi   chu";
        String ss[] = s6.split("\\s+");
        for (int i = 0; i < ss.length; i++) {
            System.out.println("("+ss[i]+")");
        }
        
    }
}
