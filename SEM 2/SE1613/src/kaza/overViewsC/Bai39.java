package kaza.overViewsC;

import java.util.ArrayList;
import java.util.Scanner;


public class Bai39 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        System.err.println("Note: Nhập số 0 thì dừng");
        
        System.out.print("Nhập số nguyên: ");
        n = Integer.parseInt(sc.nextLine());
        list.add(n);
        
        while (n!=0) {            
            System.out.print("Nhập số nguyên: ");
            n = Integer.parseInt(sc.nextLine());
            list.add(n);
        }
        
        double sum5 = 0;
        int dem5=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%5==0) {
                sum5+=list.get(i);
                dem5++;
            }
        }
        System.out.println("Trung bình cộng các số chia hết cho 5: "+(sum5/dem5));
        
        int demac=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0&&list.get(i)<0) {
                demac++;
            }
        }
        System.out.println("Có "+demac+" số âm chẵn");
    }
}
