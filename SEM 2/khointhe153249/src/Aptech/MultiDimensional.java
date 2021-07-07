/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author acer
 */
public class MultiDimensional {

    public static void main(String[] args) {
        //int mark[][] = {{5, 2}, {6, 8}, {5, 3}, {2, 6}};
//        int[][] marks = new int[4][2];
//        marks[0][0] = 23; // first row, first column
//        marks[0][1] = 65; // first row, second column
//        marks[1][0] = 42;
//        marks[1][1] = 47;
//        marks[2][0] = 60;
//        marks[2][1] = 75;
//        marks[3][0] = 75;
//        marks[3][1] = 50;
        
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(marks[i][j]+"\t");
//            }
//            System.out.println("");
//        }
//        Vector<Integer> vec = new Vector<>();
//        vec.add(1);
//        vec.add(2);
//
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(6);
//        list.add(99);
//        list.add(0, 0);
//        list.addAll(vec);
//        
//        list.set(0, 333);
//        
//        System.out.println(list);

//        String str = "Hello ";
//        Integer a = 5;
//        a.toString();

//        StringBuilder s = new StringBuilder(1);
//        s.append("haha ");
//        s.append(5);
//        s.insert(0, "insert ");
//        s.deleteCharAt(0);
//        s.reverse();
//        System.out.println(s.append(" java"));

//        Integer a = 5;
//        System.out.println(a.floatValue());
        String k = "12fr45";
        if(Character.isDigit(k.charAt(2))) {
            System.out.println("ok");
        }
        else {
            System.out.println("not");
        }
    }
}
