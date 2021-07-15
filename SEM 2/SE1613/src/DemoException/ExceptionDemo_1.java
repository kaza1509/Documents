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
public class ExceptionDemo_1 {

    public int devide1(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public int devide2(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Hey, Denominator: 0");
        }
        return a / b;
    }

    public static void main(String[] args) {
        ExceptionDemo_1 obj = new ExceptionDemo_1();
        try {
            System.out.println(obj.devide1(6, 0));
        } catch (Exception e) { //general exception
            System.out.println(e);
        }
    }
}
