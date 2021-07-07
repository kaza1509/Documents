/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author kazaf
 */
public class Main {
    
    public static void accendingFollowCode(ArrayList<Book> list){
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int k = (int) (o1.getPrice() - o2.getPrice());
                if(k==0) {
                    return o1.getCode() - o2.getCode();
                }
                return 0;
            }
            
        });
    }
    
    public static void main(String[] args) {
        ArrayList<Book> arrList = new ArrayList<>();
        Book b0 = new Book("conan", 0, 10, "truyen tranh");
        Book b1 = new Book("doremon", 1, 20, "truyen tranh");
        Book b2 = new Book("lao hac", 2, 10, "truyen dai");
        Book b3 = new Book("mat biec", 3, 40, "truyen dai");
        Book b4 = new Book("chi pheo", 4, 50, "truyen ngan");
        Book b5 = new Book("tam cam", 5, 40, "truyen dai");
        
        arrList.add(b1);
        arrList.add(b2);
        arrList.add(b3);
        arrList.add(b4);
        arrList.add(b5);
        
        for (Book o : arrList) {
            System.out.println(o);
        }
        
        accendingFollowCode(arrList);
        System.out.println("----------- Sorting -------------");
        
        for (Book o : arrList) {
            System.out.println(o);
        }
        
    }
}
