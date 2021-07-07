package kaza.overViewsC;

import java.util.Scanner;


public class Bai19 {
    
    static Scanner sc = new Scanner(System.in);
    
    static boolean check_palidrome(int n) {
        String a = String.valueOf(n);
        String k = new StringBuilder(a).reverse().toString();
        if(a.equals(k)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(check_palidrome((int) Math.pow(i, 2))) {
                System.out.print(i+"\t");
            }
        }
    }
}
