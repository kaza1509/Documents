/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoColections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nguyen Khoi
 */
public class HWColection {

    public static Scanner sc = new Scanner(System.in);

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void f1(ArrayList<Integer> a) {
        //1. Remove tất cả các pt là prime trong list a
//        2.Sort tất cả các phần tử có trong a(buble, interchange, selection sort) -? không dùng collection
//        3.sort tất cả phần tử là snt có trong hàm -> thoải mái làm càng nhiều cách càng tốt
//        4.Thêm vào trước phần tử đầu tiên là 1 số lớn nhất có giá trị 100
//        5.Gỉa sử số phần tử > 10 -> sort 5 phần tử cuối cùng , reverse 5 phần tử đầu
//        6.
        
//        for (Integer o : a) {
//            if(checkPrime(o))
//                a.remove(o);
//        }
         //c1
//        for (int i = 0; i < a.size(); i++) {
//            if (checkPrime(a.get(i))) {
//                a.remove(a.get(i));
//                i--;
//            }
//        }
        //-------------
        for (int i = a.size()-1; i >= 0; i--) {
            if (checkPrime(a.get(i))) {
                a.remove(a.get(i));
                //i--;
            }
        }
        //c2
//        ArrayList<Integer> br = new ArrayList<>();
//        for (int i = 0; i < a.size(); i++) {
//            if(checkPrime(a.get(i)))
//                br.add(a.get(i));
//        }
//        //c3
//        a.retainAll(br);
    }

    public static int f2(ArrayList<Integer>ar) {
        //1.Tính và trả về tổng snt
        //2.đếm và trả về các snt có trong list a
        return 0;
    }
    
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.print("Input size: ");
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            ar.add(rd.nextInt(100));
        }
        System.out.println("Before process: " + ar);
        f1(ar);
        System.out.println("After process: " + ar);

    }
}
