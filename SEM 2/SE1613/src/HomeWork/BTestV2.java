/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import java.util.*;

/**
 *
 * @author kazaf
 */
public class BTestV2 {
    
    public static String[] takeArrayString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                s = s.replace(s.charAt(i), ' ');
            }
        }
        s = s.trim();
        String []k = s.split("\\s+");
        return k;
    }
    
    //Đếm số xuất hiện trong chuỗi
    public static int countNumber(String s) {
        return takeArrayString(s).length;
    }
    
    //Tổng chữ số trong chuỗi s
    public static int sumNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)))
                sum+=Integer.parseInt(s.charAt(i)+"");
        }
        return sum;
    }
    
    //Tổng các số xuất hiện trong s
    public static int sumNumberV2(String s) {
        int sum = 0;
        for (int i = 0; i < takeArrayString(s).length; i++) {
            sum+=Integer.parseInt(takeArrayString(s)[i]);
        }
        return sum;
    }
    
    //Tìm max min trong chuỗi
    public static void searchMaxMin(String s) {
        int max = Integer.parseInt(takeArrayString(s)[0]);
        int min = Integer.parseInt(takeArrayString(s)[0]);
        for (int i = 0; i < takeArrayString(s).length; i++) {
            int n = Integer.parseInt(takeArrayString(s)[i]);
            if(n>max) max = n;
            if(n<min) min = n;
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
    
    public static void main(String[] args) {
        String s = "s123a2j8";
        System.out.println("Đếm số: "+countNumber(s));
        System.out.println("Tổng các số có 1 chữ số: "+sumNumber(s));
        System.out.println("Tổng các số: "+sumNumberV2(s));
        searchMaxMin(s);
    }
}
