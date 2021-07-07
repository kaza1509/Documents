package kaza.overViewsC;

import java.util.Scanner;


public class Bai14 {
    
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
        System.out.print("Nhập số n: ");
        int n = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ước số chung nguyên tố:");
        for (int i = 1; i <=n; i++) {
            if(n%i==0&&check_prime(i)) {
                System.out.print(i+"\t");
            }
        }
    }
}
