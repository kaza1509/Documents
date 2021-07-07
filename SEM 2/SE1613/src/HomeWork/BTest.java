/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import javafx.print.Collation;

/**
 *
 * @author kazaf
 */
public class BTest {

    //Đếm số xuất hiện trong chuỗi
    public static int f1CountNumber(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int flag = 0;

            for (int j = i; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j))) {
                    flag = 1;
                } else {
                    i = j;
                    break;
                }
            }

            if (flag == 1) {
                count++;
            }

        }
        return count;
    }

    //-----------------------------------
    //Tổng chữ số trong chuỗi s
    public static int f2SumNumber(String s) {
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                k += Integer.parseInt(s.charAt(i) + "");
            }
        }
        return k;
    }

    //-----------------------------------
    //Tổng các số xuất hiện trong s
    public static int f3SumNumberS(String s) {
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            String result = "";

            for (int j = i; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j))) {
                    result += s.charAt(j);
                } else {
                    i = j;
                    break;
                }
            }
            if (result != "") {
                k += Integer.parseInt(result);
            }
        }
        return k;
    }

    //-----------------------------------
    //Tìm max min trong chuỗi
    public static ArrayList<Integer> list(String s) {
        int k = 0;
        ArrayList<Integer> listN = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            String result = "";

            for (int j = i; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j))) {
                    result += s.charAt(j);
                } else {
                    i = j;
                    break;
                }
            }
            if (result != "") {
                listN.add(Integer.parseInt(result));
            }
        }
        return listN;
    }

    public static void f2TakeMaxMin(String s) {
        ArrayList<Integer> list = list(s);
        Collections.sort(list);
        System.out.println("Max: " + list.get(list.size() - 1));
        System.out.println("Min: " + list.get(0));
    }

    
    public static void main(String[] args) {
        String s = "s123a2";
//        System.out.println("Đếm số xuất hiện trong chuỗi: " + f1CountNumber(s));
//        System.out.println("Tổng chữ số trong chuỗi: " + f2SumNumber(s));
//        System.out.println("Tổng các chữ số xuất hiện trong chuỗi: " + f3SumNumberS(s));
//        f2TakeMaxMin(s);
    }
}
