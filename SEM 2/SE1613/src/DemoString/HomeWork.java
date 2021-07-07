/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoString;

import java.util.Scanner;

/**
 *
 * @author Nguyen Khoi
 */
class YourHW {

    //BTVN định nghĩa ít nhất 25 từ khác nhau
    //Viết hàm check để kiểm tra 20 loại từ khác nhau
    boolean check(String s) {
        return s.length() <= 3;
    }

    int f1(String s) {
        //đếm và trả về số từ trong chuỗi thỏa mãn abc
        //đém vào trả về số từ trong chuỗi s mà là xâu password
        //leng>=5,có digit, có uppercase
        //đếm và trả về số từ có độ dài nhỏ hơn hoặc bằng 3
        String arr[] = s.split("\\s+");
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (check(arr[i])) {
                dem++;
            }
        }
        return dem;
    }

    //check nguyên âm
    boolean check_na(String s) {
        int demna = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'u' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'a' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'U' || s.charAt(i) == 'E' || s.charAt(i) == 'O' || s.charAt(i) == 'A' || s.charAt(i) == 'I') {
                demna++;
            }
        }
        if (demna == 2) {
            return true;
        }
        return false;
    }

    String f2(String s) {
        //tìm và trả về từ đầu tiên (cuối cùng thỏa mãn ddkien abc)
        //tìm và trả về từ đầu tiên có chính xác 2 nguyên âm
        String s1[] = s.split("\\s+");
        for (int i = 0; i < s1.length; i++) {
            if (checkNaDifference(s1[i])) {
                return s1[i];
            }
        }
        return "Not exist";
    }

    boolean checkNaDifference(String s) {
        String s1 = s.toLowerCase();
        String add = "";
        int dem = 0;
        String vowel = "oeuai";
        for (int i = 0; i < s1.length(); i++) {
            if ( vowel.contains(s1.charAt(i) + "") && !add.contains(s1.charAt(i) + "") ) {
                dem++;
                add += s1.charAt(i);
            }
        }
        if (dem == 2)
                return true;
        return false;
    }

    String f3(String s) {
        //sort tất cả các từ thỏa mãn điều kiện abc
        //sort tất cả các từ trong chuỗi s hoặc là có dạng proper(kí tự đầu viết hoa còn kí tự sau viết thường)
        return null;
    }
    
    boolean checkDigit(int s){
        //viết và định nghĩa 15 loại số khác nhau 
        return true;
    }
    
    String f4(String s) {
        //sort tất cả các từ ở vị trí thỏa mãn xyz theo thứ tự tăng dần từ điển 
        //sort tất cả các từ ở vị trí chẵn theo tăng dần từ điển
        return null;
    }
    //với mỗi loại bài tập trên viết áp dụng 3 bài tập cụ thể tùy chọn 
}

public class HomeWork {

    public static void main(String[] args) {
        YourHW hw = new YourHW();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        String line = sc.nextLine();
//        System.out.println("Results = " + hw.f1(line));
        System.out.println("Results = " + hw.f2(line));

    }
}
