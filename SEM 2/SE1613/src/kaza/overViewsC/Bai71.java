package kaza.overViewsC;

import java.util.Scanner;

public class Bai71 {
    
    static Scanner sc = new Scanner(System.in);
    
    static boolean check_perfect_number(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0) {
                sum+=i;
            }
        }
        
        if(sum == n) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i < 5000; i++) {
            if(check_perfect_number(i)) {
                System.out.println(i+"\t");
            }
        }
    }
}
