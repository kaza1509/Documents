package kaza.overViewsC;

import java.util.Scanner;


public class Bai31 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập String source: ");
        String a = sc.nextLine();
        String b = new StringBuilder(a).reverse().toString();
        if(a.equals(b)) {
            System.out.println("This is pallindrome");
        }
        else {
            System.out.println("This is not palindrome");
        }
    }
}
