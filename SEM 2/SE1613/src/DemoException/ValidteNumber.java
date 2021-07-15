/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoException;

import java.util.Scanner;

/**
 *
 * @author kazaf
 */
public class ValidteNumber {
    public static int getInt(int min, int max) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number from: [%d - %d]: ", min, max);
        while (true) {            
            try {
                n = Integer.parseInt(sc.nextLine());
                if(n>=min && n<=max)
                    break;
                else
                    System.out.printf("Input number from: [%d - %d]: ", min, max);
            } 
            catch (NumberFormatException e) {
                System.out.println("Wrong format");
                System.out.printf("Input number from: [%d - %d]: ", min, max);
            }
            catch(Exception e)
            {
                System.out.println("Error: "+e.getMessage());
                System.out.printf("Input number from: [%d - %d]: ", min, max);
            }
        }
        return n;
    }
    
    public static void main(String[] args) {
        System.out.println(getInt(0, 100));
    }
}
