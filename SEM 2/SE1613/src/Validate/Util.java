/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import java.util.Scanner;

/**
 *
 * @author kazaf
 */
public class Util {

    public static Scanner sc = new Scanner(System.in);

    public static int getInteger(String title) {
        int n;
        System.out.print(title+": ");
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.err.print(title+": ");
            }
        }
    }
    
    public static double getDouble(String title) {
        double n;
        System.out.print(title+": ");
        while (true) {
            try {
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.err.print(title+": ");
            }
        }
    }
}
