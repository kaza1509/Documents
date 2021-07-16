/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanfoundry;

import java.util.*;

/**
 *
 * @author acer
 */
public class DemoTreeSet {
    
    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    } 
    
    public static void f214(ArrayList<Integer> a) {
//        ArrayList<Integer> vt = new ArrayList<>();
//        
//        for (int i = 0; i < a.size(); i++) {
//            if(!checkPrime(i))
//                vt.add(i);
//        }
        
        ArrayList<Integer> value = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if(!checkPrime(i))
                value.add(a.get(i));
        }
        a.clear();
        a.addAll(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.print("Input size of list: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            ar.add(rd.nextInt(100));
        }
        System.out.println("---------------");
        System.out.println(ar);
        f214(ar);
        System.out.println(ar);
                
    }
}
