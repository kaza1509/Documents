package kaza.overViewsC;

import java.util.ArrayList;
import java.util.Scanner;


public class Bai13 {
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
        
        double sumCan2 = 0;
        int dem5=0;
        for (int i = 0; i < list.size(); i++) {
            sumCan2+=(double)Math.sqrt(list.get(i));
        }
        System.out.println("Tổng căn bậc hai: "+sumCan2);
        
        int demac=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==1&&list.get(i)<0) {
                demac++;
            }
        }
        System.out.println("Có "+demac+" số âm lẻ");
    }
    
}
