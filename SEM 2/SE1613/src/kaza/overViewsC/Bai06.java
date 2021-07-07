package kaza.overViewsC;

import java.util.Random;
import java.util.Scanner;


public class Bai06 {
//    static 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Nhập n: ");
        n = Integer.parseInt(sc.nextLine());;
        
        int a[][] = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.print("Nhập a["+i+"]["+j+"] = ");
                Random rand = new Random();
                a[i][j] = rand.nextInt(1000)+(-100);
//                a[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        
        System.out.print("Các số sao cho i+j chia hết cho 3: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j%3==0) {            
                    System.out.print(a[i][j]+"\t");
                }
            }
        }
        
        int sum = 0, count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j]>0) {
                    count++;
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("\nTrung bình cộng các phần tử dương trong mảng là: "+((double)sum/count));
        
        System.out.println("\nIn ra: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
}
