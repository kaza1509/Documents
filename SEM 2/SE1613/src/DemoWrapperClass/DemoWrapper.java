/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoWrapperClass;

/**
 *
 * @author Nguyen Khoi
 */
public class DemoWrapper {
    public static void main(String[] args) {
        Integer a = 40;
        Integer b = 20;
        System.out.println("Compare: "+Integer.compare(a, b));
        System.out.println("CompareTo: "+a.compareTo(b));
        int x = -1, y = 3647568;
        System.out.println("CompareUnssign: "+Integer.compareUnsigned(x, y));
//        System.out.println("Max: "+b.MAX_VALUE);
//        System.out.println("Min: "+Integer.MIN_VALUE);
//        System.out.println("Type: "+b.TYPE);
//        System.out.println("Size: "+b.SIZE);
//        System.out.println("byteValue: "+b.byteValue());
//        System.out.println("shortValue: "+b.shortValue());
    }
}
