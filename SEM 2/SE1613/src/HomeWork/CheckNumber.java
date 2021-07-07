/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

import java.util.Scanner;

/**
 *
 * @author Nguyen Khoi
 */
public class CheckNumber {

    public static Scanner sc = new Scanner(System.in);

    //1.Check số nguyên tố
    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //2.Check số hoàn hảo
    public static boolean checkPerfectNumber(int n) {
        int temp = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (temp == sum) {
            return true;
        }
        return false;
    }
    
    //3.Check số chẵn
    public static boolean checkEven(int n) {
        if(n%2==0)
            return true;
        return false;
    }
    
    //4.Check số lẻ
    public static boolean checkOdd(int n) {
        if(n%2==1)
            return true;
        return false;
    }
    
    //5.Check số Amstrong
    public static boolean checkAmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (n>0) {            
            int sd = n%10;
            sum+=Math.pow(sd, 3);
            n/=10;
        }
        if(sum == temp)
            return true;
        return false;
    }
    
    //6. Check số chia hết cho 2 và 5;
    public static boolean checkDevide2And5(int n) {
        if(n%10==0) {
            return true;
        }
        return false;
    }
    
    //7.Check số có chính xác 5 ước dương
    public static boolean check5Uoc(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0)
                count++;
        }
        if(count == 5)
            return true;
        return false;
    }
    
    //8.Check số chính phương
    public static boolean checkSquareNumber(int n) {
        for (int i = 1; i < n; i++) {
            if(i*i == n) 
                return true;
        }
        return false;
    }
    
    //9.check số lucky number(chỉ bao gồm 6 và 9)
    public static boolean checkLuckyNumber(int n) {
        String tmp = String.valueOf(n);
        String k = "69";
        for (int i = 0; i < tmp.length(); i++) {
            if(!k.contains(tmp.charAt(i)+""))
                return false;
        }
        return true;
    }
    
    //10. Check số toàn lẻ
    public static boolean checkOddNumber(int n) {
        String tmp = String.valueOf(n);
        String k = "13579";
        for (int i = 0; i < tmp.length(); i++) {
            if(!k.contains(tmp.charAt(i)+""))
                return false;
        }
        return true;
    }
    
    //11.Check có phải là số nguyên không?
    public static boolean checkIntNumber() {           
        try {
            System.out.print("Nhập n: ");
            int n = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    //12.Check số dư là 2
    public static boolean checkMod5Equal4(int n) {
        return (n%5==4);
    }
    
    //13. Check số của 4 chữ số
    public static boolean check4ChuSo(int n) {
        String k = String.valueOf(n);
        return k.length()==4;
    }
    
    //14. check số có ước toàn lẻ trừ 1 và nó
    public static boolean checkUocLe(int n) {
        for (int i = 2; i < n; i++) {
            if(n%i==0&&i%2==0)
                return false;
        }
        return true;
    }
    
    //15. Check số đối xứng
    public static boolean checkdx(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s))
            return true;
        return false;
    }

    public static void main(String[] args) {
        
    }
}
