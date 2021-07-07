package kaza.overViewsC;

import java.util.Scanner;


public class Bai74 {
    
    static int gt(int n) {
        int gt=1;
        for (int i = 1; i <= n; i++) {
            gt*=i;
        }
        return gt;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = Integer.parseInt(sc.nextLine());
        
        double s = 1;
        for (int i = 1; i < n; i++) {
            int tu = (i+1);
            int mau = gt(i)*gt(i+1);
            s = s + (double)tu/mau;
        }
        System.out.println("Sum s = "+s);
    }
}
