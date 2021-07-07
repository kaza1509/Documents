package kaza.overViewsC;

import java.util.ArrayList;
import java.util.Scanner;


public class Bai54 {
    static Scanner sc = new Scanner(System.in);
    
    static boolean check_prime(int n) {
        if(n<2) {
            return false;
        }
        else {
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        System.err.println("Note: Nhập số âm thì dừng");
        while (n>=0) {            
            System.out.print("Nhập số nguyên: ");
            n = Integer.parseInt(sc.nextLine());
            list.add(n);
        }
        
        System.out.println("In ra những số không phải là số nguyên tố: ");
        for (int i = 0; i < list.size(); i++) {
            if(!check_prime(list.get(i))) {
                System.out.print(list.get(i)+"\t");
            }
        }
    }
}
