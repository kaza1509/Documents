/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoException;

/**
 *
 * @author kazaf
 */
public class DemoException {
    
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            System.out.println("Hello".charAt(10));
            System.out.println(3/0);
        } catch (Exception e) {
            System.out.println("Lỗi: "+ e.getMessage());
        } 
        System.out.println("Goodbye");
    }
}
